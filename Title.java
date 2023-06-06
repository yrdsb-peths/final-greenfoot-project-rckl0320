import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting screen
 * 
 * @author Rick
 * @version 1
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(816, 624, 1); 
    }

    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameStart = new MyWorld(1, 1);
            Greenfoot.setWorld(gameStart);
        }
    }
}