import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

import java.util.Random;

/**
 * A world where wombats live.
 * 
 * @author Michael Kolling
 * @version 1.0.1
 */
public class WombatWorld extends World
{
    /**
     * Create a new world with 8x11 cells and
     * with a cell size of 60x60 pixels
     */
    public WombatWorld() 
    {
        super(11, 8, 60);        
        setBackground("cell.jpg");
    }

    /**
     * Populate the world with a fixed scenario of wombats and leaves.
     */    
    public void populate()
    {
        Wombat w1 = new Wombat();
        addObject(w1, 3, 3);
        
        Wombat w2 = new Wombat();
        addObject(w2, 7, 7);
        
        Seahorses s1 = new Seahorses();
        addObject(s1, 8, 8);
        
        Seahorses s2 = new Seahorses();
        addObject(s2, 2, 6);
        
        AorrowPlane a1 = new AorrowPlane();
        addObject(a1, 10, 4);
        
        double ch = Math.random();
        if(ch < 0.50)
        {
            BOOM b1 = new BOOM();
            addObject(b1, 0, 0);
        }
        if(ch < 0.50)
        {
            Cthulhu GameOver = new Cthulhu();
            addObject(GameOver, 6, 4);
        }

        Leaf l1 = new Leaf();
        addObject(l1, 5, 3);

        Leaf l2 = new Leaf();
        addObject(l2, 0, 2);

        Leaf l3 = new Leaf();
        addObject(l3, 7, 5);

        Leaf l4 = new Leaf();
        addObject(l4, 2, 9);

        Leaf l5 = new Leaf();
        addObject(l5, 5, 1);
        
        Leaf l6 = new Leaf();
        addObject(l6, 6, 4);
        
        Pizza p1 = new Pizza();
        addObject(p1, 8, 8);
        
        Pizza p2 = new Pizza();
        addObject(p2, 1, 1);
        
        Pizza p3 = new Pizza();
        addObject(p3, 3, 4);
        
        Pizza p4 = new Pizza();
        addObject(p4, 2, 2);
        
        Pizza p5 = new Pizza();
        addObject(p5, 1, 9);
        
        Pizza p6 = new Pizza();
        addObject(p6, 10, 6);
        
    }
    
    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomLeaves(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Leaf leaf = new Leaf();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(leaf, x, y);
        }
    }
    /**
     * Place a number of leaves into the world at random places.
     * The number of leaves can be specified.
     */
    public void randomPizzas(int howMany)
    {
        for(int i=0; i<howMany; i++) {
            Pizza pizza = new Pizza();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(pizza, x, y);
        }
    }
}