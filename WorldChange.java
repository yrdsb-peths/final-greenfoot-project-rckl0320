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
    
    String endPoint;
    int x;
    int y;
    int selector;
    
    public void toWorld(int x, int y, String z, int a)
    {
        this.x = x;
        this.y = y;
        endPoint = z;
        selector = a;
        
    }
    
    public void act()
    {
        switch (endPoint){
            
            case "MyWorld":
                Greenfoot.setWorld(new World1(x, y));
                break;
        
            case "World1":
                if(selector == 1){
                    Greenfoot.setWorld(new MyWorld(x, y));
                    break;
                }
                break;

        }
    }
}
