import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;
import java.util.ArrayList;
/**
 * makes a seahorse and enables it to find and eat pizzas
 * 
 * @author JJ Locke
 * @version 4/21/11
 */
public class Seahorses  extends Critter
{
    
    private int pizzasEaten;

    public Seahorses()
    {
        setDirection(EAST);
        pizzasEaten = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if(foundPizza()) {
            eatPizza();
        }
        else if(canMove()) {
             double myRands = Math.random();
            if (myRands < 0.8)
                 move();
            else if (myRands < 0.95)
                 turnLeft();
            else
                 turnRight();
        }
        else {
            double myRand = Math.random();
            if(myRand < 0.5)
                turnRight();
            else
                turnLeft();
        }
    }

    /**
     * Check whether there is a pizza in the same cell as we are.
     */
    public boolean foundPizza()
    {
        Actor Pizza = getOneObjectAtOffset(0, 0, Pizza.class);
        if(Pizza != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Eat a Pizza.
     */
    public void eatPizza()
    {
        Actor pizza = getOneObjectAtOffset(0, 0, Pizza.class);
        if(pizza != null) {
            // eat the leaf...
            getWorld().removeObject(pizza);
            pizzasEaten = pizzasEaten + 1; 
        }
    }

    /**
     * Tell how many pizzas we have eaten.
     */
    public int getPizzasEaten()
    {
        return pizzasEaten;
    }
}
