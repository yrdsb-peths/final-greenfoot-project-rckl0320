import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tree2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tree2 extends Wall
{
    /**
     * Act - do whatever the Tree2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        GreenfootImage tr = getImage();
        tr.scale(110, 118);
        setImage(tr);
    }
}
