import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{

    /**
     * Constructor for scrolling variables and objects.
     * 
     */
    public static final int WIDE = 800;
    public static final int HIGH = 600;
    
    
    Scroller scroller;
    Actor scrollActor;
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDE, HIGH, 1, false);
        GreenfootImage bg = new GreenfootImage("bg.png");
        int bgWide = bg.getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bgWide, bgHigh);
        scrollActor = new Chara();
        addObject(scrollActor, bgWide/2, 500);
        scroll();
        
        //Chara player1 = new Chara();
        //addObject(player1, 500, 200);
        
        Wall w = new Wall();
        addObject(w, 400, 200);
        
        WorldChange b = new WorldChange();
        addObject(b, getWidth()/2, 560);
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
