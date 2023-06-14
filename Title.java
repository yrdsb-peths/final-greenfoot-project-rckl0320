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
        // Create a new world with cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }

    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {  
            Forest firstWorld = new Forest(0);
            //Chara player = new Chara();
            //firstWorld.addObject(player, getWidth()/2, 550);
            
            Greenfoot.setWorld(firstWorld);
        }
    }
}