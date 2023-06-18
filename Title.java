import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting screen
 * 
 * @author Rick
 * @version 1
 */
public class Title extends World
{
    SimpleTimer delay = new SimpleTimer();
    //background music
    GreenfootSound bgm = new GreenfootSound("images/bgm.mp3");
    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        delay.mark();
        
    }

    
    public void act()
    {
        
        bgm.playLoop();
        if(Greenfoot.isKeyDown("space"))
        {
            if(delay.millisElapsed() < 1000){
            return;
            }
            TipsScreen tps = new TipsScreen();      
            Greenfoot.setWorld(tps);
            
        }
    
    }
    
    
}