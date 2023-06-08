import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    Actor player;
    Scroller scroller;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {
        super(816, 624, 1);
         
        
    }
    public void act()
    {
        int x = player.getX() - 816/2;
        int y = player.getY() - 624/2;
        scroller.scroll(x, y);
    }
}
