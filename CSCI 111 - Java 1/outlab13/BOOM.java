import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * spawns in a rocket and it blows up the plane
 * 
 * @author JJ Locke
 * @version 4/21/11
 */
public class BOOM  extends Critter
{
    private int aorrowPlanesBlownUp;

    public BOOM()
    {
        setDirection(EAST);
        aorrowPlanesBlownUp = 0;
    }

    /**
     * Do whatever the wombat likes to to just now.
     */
    public void act()
    {
        if(foundAorrowPlane()) {
            blowUpAorrowPlane();
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
     * Eat a leaf.
     */
    public void blowUpAorrowPlane()
    {
        Actor aorrowPlane = getOneObjectAtOffset(0, 0, AorrowPlane.class);
        if(aorrowPlane != null) {
            // eat the leaf...
            getWorld().removeObject(aorrowPlane);
            aorrowPlanesBlownUp = aorrowPlanesBlownUp + 1; 
        }
    }

    /**
     * Tell how many leaves we have eaten.
     */
    public int getAorrowPlanesBlownUp()
    {
        return aorrowPlanesBlownUp;
    }
}
