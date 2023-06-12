import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Modified "Actor following scrolling code" world
 * 
 * 
 * @author danpost 
 * Modified by Rick
 */
public class WorldScroll extends World
{
    public static final int WIDE = 800;
    public static final int HIGH = 600;
    
    
    Scroller scroller;
    Actor scrollActor;
    
    public WorldScroll()
    {
        super(WIDE, HIGH, 1, false);
        GreenfootImage bg = new GreenfootImage("bg.png");
        int bgWide = bg.getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bgWide, bgHigh);
        scrollActor = new Chara();
        addObject(scrollActor, bgWide/2, bgHigh/2);
        scroll();
        
        
    }
    public void act()
    {
        if(scrollActor != null){
            scroll();
        }
    }
    
    private void scroll()
    {
        int dsx = scrollActor.getX() - WIDE/2;
        int dsy = scrollActor.getY() - HIGH/2;
        scroller.scroll(dsx, dsy);
    }
}
