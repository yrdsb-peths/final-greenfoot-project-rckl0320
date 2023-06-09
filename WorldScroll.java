import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldScroll extends World
{
    public static final int WIDE = 800;
    public static final int HIGH = 600;
    public static final int CELL = 1;
    
    private Scroller scroller = null;
    
    public WorldScroll()
    {
        super(WIDE, HIGH, CELL, false);
        scroller = new Scroller(this, null);
        
    }
    public void act()
    {
        scroll();
    }
    
    private void scroll()
    {
        scroller.scroll(800, 600);
    }
}
