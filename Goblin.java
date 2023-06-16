import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goblin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblin extends Actor
{
    /**
     * Act - do whatever the Goblin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int cx;
    int cy;
    public Goblin(int x, int y){
        cx = x;
        cy = y;
    }
    public void act()
    {
        GreenfootImage cr = getImage();
        cr.scale(64, 64);
        
    }
    
    public void roam()
    {
        if(getObjectsInRange(500, Chara.class) != null){
            turnTowards(cx, cy);
            move(3);
        }
    }
}
