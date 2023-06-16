import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TipsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TipsScreen extends World
{

    /**
     * Constructor for objects of class TipsScreen.
     * 
     */
    public TipsScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
    }
    public void act(){
        if(Greenfoot.isKeyDown("space")){
            Forest firstWorld = new Forest();           
            Greenfoot.setWorld(firstWorld);
        }
    }
}
