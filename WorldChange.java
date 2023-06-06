import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Allows Character to switch between worlds
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldChange extends Actor
{
    /**
     * Act - do whatever the WorldChange wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    String start;
    int x;
    int y;
    int selector;
    
    public void toWorld(int x, int y, String z, int a)
    {
        this.x = x;
        this.y = y;
        start = z;
        selector = a;
        
    }
    
    public void act()
    {
        if(isTouching(Chara.class))
        {
            if(start == "MyWorld"){
                World1 wrld = new World1(x, y);
                Greenfoot.setWorld(wrld);
            
            }
            if(start == "World1" && selector == 1)
            {
                MyWorld wrld = new MyWorld(x, y);
                Greenfoot.setWorld(wrld);
            }
        }
    }
}
