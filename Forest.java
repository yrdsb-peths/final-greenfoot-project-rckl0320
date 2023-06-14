import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting world
 * 
 * @author Rick L
 * @version May 30, 2023
 */
public class Forest extends World
{

    /**
     * Constructor for scrolling variables and objects.
     * 
     */
    public static final int WIDE = 800;
    public static final int HIGH = 600;
    
    
    
    Scroller scroller;
    Actor scrollActor;
    Actor lightCircle;
    
    public Forest(int firstTime)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDE, HIGH, 1, false);
        GreenfootImage bg = new GreenfootImage("bg.png");
        int bgWide = bg.getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bgWide, bgHigh);
        scrollActor = new Chara();
        
        if(firstTime == 0){
            addObject(scrollActor, bgWide/2, 550);    
        }
        else{
            addObject(scrollActor, bgWide/2, 70);
        }
        scroll();
        
    
        //Objects in the world
        Wall wol = new Wall();
        addObject(wol, getWidth()/2, 200);
        
        WorldChange a = new WorldChange();
        addObject(a, getWidth()/2, 0);
        
        Interaction sa = new Interaction();
        addObject(sa, 400, 300);
        
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
