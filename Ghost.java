import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Chases the player
 * 
 * @author Rick
 * @version (a version number or a date)
 */
public class Ghost extends Actor
{
    /**
     * Act - do whatever the Ghost wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static int spd = 1;
    public void act()
    {
        GreenfootImage cr = getImage();
        cr.scale(64, 64);
        spd = 1;
        roam();
    }
    
    public void roam()
    {
        if(!getObjectsInRange(500, Chara.class).isEmpty()){
            Actor plc = getObjectsInRange(500, Chara.class).get(0);
            
            
            turnTowards(plc.getX(), plc.getY());
            move(spd);
            
        }
    }
}
