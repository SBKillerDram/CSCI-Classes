import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;
import java.util.ArrayList;
/**
 * spawns in Cthulhu and makes him eat EVERYTHING
 * 
 * @author JJ Locke 
 * @version 4/21/11
 */
public class Cthulhu  extends Critter
{
    private int wombatsEaten;
    private int seahorsesEaten;
    private int booms;
    private int aorrowPlanesEaten;
    private int leavesEaten;
    private int pizzasEaten;

    public Cthulhu()
    {
        setDirection(EAST);
        wombatsEaten = 0;
        seahorsesEaten = 0;
        booms = 0;
        leavesEaten = 0;
        pizzasEaten = 0;
        aorrowPlanesEaten = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if(foundWombat() || foundSeahorses() || foundLeaf() || foundPizza() || foundAorrowPlane() || foundBoom())
        {
            eatWombat();
            eatSeahorses();
            boosh();
            eatAorrowPlane();
            eatLeaf();
            eatPizza();
        }
        else if(canMove()) 
        {
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
     * Check whether there is a wombat in the same cell as we are.
     */
    public boolean foundWombat()
    {
        Actor Wombat = getOneObjectAtOffset(0, 0, Wombat.class);
        if(Wombat != null) {
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * Check whether there is a seahorse in the same cell as we are.
     */
    public boolean foundSeahorses()
    {
        Actor Seahorses = getOneObjectAtOffset(0, 0, Seahorses.class);
        if(Seahorses != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Check whether there is a leaf in the same cell as we are.
     */
    public boolean foundLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if(leaf != null) {
            return true;
        }
        else {
            return false;
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
     * Check whether there is a leaf in the same cell as we are.
     */
    public boolean foundAorrowPlane()
    {
        Actor aorrowPlane = getOneObjectAtOffset(0, 0, AorrowPlane.class);
        if(aorrowPlane != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Check whether there is a seahorse in the same cell as we are.
     */
    public boolean foundBoom()
    {
        Actor Boom = getOneObjectAtOffset(0, 0, BOOM.class);
        if(Boom != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Eat a leaf.
     */
    public void eatAorrowPlane()
    {
        Actor aorrowPlane = getOneObjectAtOffset(0, 0, AorrowPlane.class);
        if(aorrowPlane != null) {
            // eat the leaf...
            getWorld().removeObject(aorrowPlane);
            aorrowPlanesEaten = aorrowPlanesEaten + 1; 
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
     * Eat a leaf.
     */
    public void eatLeaf()
    {
        Actor leaf = getOneObjectAtOffset(0, 0, Leaf.class);
        if(leaf != null) {
            // eat the leaf...
            getWorld().removeObject(leaf);
            leavesEaten = leavesEaten + 1; 
        }
    }
    
    /**
     * Eat a wombat.
     */
    public void eatWombat()
    {
        Actor Wombat = getOneObjectAtOffset(0, 0, Wombat.class);
        if(Wombat != null) {
            // eat the leaf...
            getWorld().removeObject(Wombat);
            wombatsEaten = wombatsEaten + 1; 
        }
    }
    /**
     * Eat a seahorses.
     */
    public void eatSeahorses()
    {
        Actor Seahorses = getOneObjectAtOffset(0, 0, Seahorses.class);
        if(Seahorses != null) {
            // eat the leaf...
            getWorld().removeObject(Seahorses);
            seahorsesEaten = seahorsesEaten + 1; 
        }
    }
    /**
     * Eat a seahorses.
     */
    public void boosh()
    {
        Actor BOOM = getOneObjectAtOffset(0, 0, BOOM.class);
        if(BOOM != null) {
            // eat the leaf...
            getWorld().removeObject(BOOM);
            booms = booms + 1; 
        }
    }

    /**
     * Tell how many wombats we have eaten.
     */
    public int getWombatsEaten()
    {
        return wombatsEaten;
    }
    /**
     * Tell how many seahorses we have eaten.
     */
    public int getSeahorsesEaten()
    {
        return seahorsesEaten;
    }
    /**
     * Tell how many booms we have eaten.
     */
    public int getBooms()
    {
        return booms;
    }
    /**
     * Tell how many leaves we have eaten.
     */
    public int getLeavesEaten()
    {
        return leavesEaten;
    }
    /**
     * Tell how many pizzas we have eaten.
     */
    public int getPizzasEaten()
    {
        return pizzasEaten;
    }
    /**
     * Tell how many leaves we have eaten.
     */
    public int getAorrowPlanesEaten()
    {
        return aorrowPlanesEaten;
    }
}
