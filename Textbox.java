import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Textbox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Textbox extends Actor
{
    /**
     * Act - do whatever the Textbox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public void act()
    {
        GreenfootImage a = getImage();
        a.scale(600, 300);  
    }
    public void setLocation(int x, int y){}
}
