import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int selectorY;
    public Menu(){
        
    }
    public void act()
    {
        
        Label inv = new Label("ITEMS", 50);
        getWorld().addObject(inv, 180, 90);
        //Selection detection for menu
        
    }
}
