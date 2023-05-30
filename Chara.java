import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chara extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int tracker = 0;
        
        
        if (Greenfoot.isKeyDown("up") && (tracker == 0))
        {
            setRotation(270);
            move(3);
            
        }
        else if (Greenfoot.isKeyDown("down") && (tracker == 0))
        {
            setRotation(90);
            move(3);
        }
        else if (Greenfoot.isKeyDown("left") && (tracker == 0))
        {
            setRotation(180);
            move(3);
        }
        else if (Greenfoot.isKeyDown("right") && (tracker == 0))
        {
            setRotation(0);
            move(3);
        }
        
    }
}
