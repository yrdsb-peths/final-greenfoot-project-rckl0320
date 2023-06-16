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
    
    
    Scroller scroller;
    Actor scrollActor;
    Actor lightCircle;
    public World2()
    {
        super(WIDE, HIGH, 1, true);
        GreenfootImage bg = new GreenfootImage("arena.png");
        int bgWide = bg.getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bgWide, bgHigh);
        scrollActor = new Chara();
        addObject(scrollActor, bgWide/2, bgHigh/2);
        scroll();
        
        lightCircle = new Spotlight();
        addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
    }
    public void act()
    {
        if(scrollActor != null){
            scroll();
            lightCircle.setLocation(scrollActor.getX(), scrollActor.getY() + 80); 
        }
    }
    
    private void scroll()
    {
        int dsx = scrollActor.getX() - WIDE/2;
        int dsy = scrollActor.getY() - HIGH/2;
        scroller.scroll(dsx, dsy);
    }
}