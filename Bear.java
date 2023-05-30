import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bear extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int tracker = 0;
        
        
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
            move(2);
            
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(2);
        }
        else if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
            move(2);
        }
        else if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(2);
        }
    }
}
