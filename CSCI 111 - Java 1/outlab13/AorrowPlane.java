import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.List;
import java.util.ArrayList;
/**
 * makes an aorrowplane and enables it to find wambats and seahorses and to make it eat them
 * 
 * @author JJ Locke 
 * @version 4/21/11
 */
public class AorrowPlane  extends Critter
{
    
    private int wombatsEaten;
    private int seahorsesEaten;
    private int booms;

    public AorrowPlane()
    {
        setDirection(EAST);
        wombatsEaten = 0;
        seahorsesEaten = 0;
        booms = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if(foundWombat() || foundSeahorses() || foundBoom())
        {
            eatWombat();
            eatSeahorses();
            boosh();
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
        Actor Boom = getOneObjectAtOffset(0, 0, BOOM.class);
        if(Boom != null) {
            // eat the leaf...
            getWorld().removeObject(Boom);
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
}
