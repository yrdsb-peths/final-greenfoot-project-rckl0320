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
    public MyWorld(int x, int y)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(816, 624, 1, true);
        
        Chara player = new Chara();
        addObject(player, getWidth()/2, 550);
        
        Wall wol = new Wall();
        addObject(wol, 300, 100);
        
        WorldChange a = new WorldChange();
        addObject(a, getWidth()/2, 0); 
        
        
    }
    

}
