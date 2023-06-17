import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TipsScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TipsScreen extends World
{
    SimpleTimer TipDelay = new SimpleTimer();
    /**
     * Constructor for objects of class TipsScreen.
     * 
     */
    public TipsScreen()
    {   
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        TipDelay.mark();
    }
    public void act(){
        
        if(TipDelay.millisElapsed() < 2000){
            return;
        }
        TipDelay.mark();
        Forest firstWorld = new Forest();           
        Greenfoot.setWorld(firstWorld);
        Chara.lives = 3;
    }
}
