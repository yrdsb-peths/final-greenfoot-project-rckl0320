import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
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
        super(816, 624, 1);
        
        Chara sjo = new Chara();
    
        addObject(sjo, 200, 200);
        
        Wall wol = new Wall();
        
        addObject(wol, 300, 250);
    }
    
    
}
