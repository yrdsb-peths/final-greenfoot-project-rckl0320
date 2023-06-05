import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting world
 * 
 * @author Rick L
 * @version May 30, 2023
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(816, 624, 1, true);
        
        Chara player = new Chara();
        
        addObject(player, getWidth()/2, 500);
        
        Wall wol = new Wall();
        
        addObject(wol, 300, 250);
        
        
        
    }
    

}
