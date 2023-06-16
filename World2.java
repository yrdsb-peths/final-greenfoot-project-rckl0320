import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Modified "Actor following scrolling code" world
 * 
 * 
 * @author danpost 
 * Modified by Rick
 */
public class World2 extends World
{
    public static final int WIDE = 800;
    public static final int HIGH = 600;
    
    
    
    Actor scrollActor;
    Actor lightCircle;
    public World2()
    {
        super(800, 600, 1, true);
        
        scrollActor = new Chara();
        addObject(scrollActor, 400, 500);
        lightCircle = new Spotlight();
        addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
    }
    public void act()
    {
        lightCircle.setLocation(scrollActor.getX(), scrollActor.getY() + 80); 
        
        
        Ghost ko = new Ghost();
        addObject(ko, 100, 100);
        
    }
    

}