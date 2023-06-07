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
    
    static String endPoint = "";
    static int x;
    static int y;
    static int selector;
    
    public static void toWorld(String z, int h, int v, int a)
    {
        x = h;
        y = v;
        endPoint = z;
        selector = a;
        
    }
    
    public void act()
    {
        switch (endPoint){
            
            case "World1":
                if(selector == 1){
                    Greenfoot.setWorld(new World1(x, y));
                    break;
                }
        
            case "MyWorld":
                if(selector == 1){
                    Greenfoot.setWorld(new MyWorld(x, y));
                    break;
                }
                

        }
    }
}
