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

    public Forest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDE, HIGH, 1, false);
        GreenfootImage bg = new GreenfootImage("open background.png");
        int bgWide = bg.getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bg.getWidth(), bg.getHeight());
        scrollActor = new Chara();

       
        addObject(scrollActor, 400, 600);    
        
        
        scroll();

        //Objects in the world
            
        
        Well a = new Well();
        addObject(a, getWidth()/2, 100);

        
        
        prepare();
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

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Tree1 tree1 = new Tree1();
        addObject(tree1,53,15);
        Tree1 tree12 = new Tree1();
        addObject(tree12,43,411);
        Tree2 tree2 = new Tree2();
        addObject(tree2,40,162);
        Tree1 tree13 = new Tree1();
        addObject(tree13,100,300);
        Tree2 tree22 = new Tree2();
        addObject(tree22,712,27);
        Tree2 tree23 = new Tree2();
        addObject(tree23,601,183);
        Tree1 tree14 = new Tree1();
        addObject(tree14,745,234);
        Tree1 tree15 = new Tree1();
        addObject(tree15,657,383);
        Tree1 tree16 = new Tree1();
        addObject(tree16,752,320);
        Tree1 tree17 = new Tree1();
        addObject(tree17,593,555);
        tree17.setLocation(410,215);
        tree17.setLocation(140,129);
        Tree2 tree24 = new Tree2();
        addObject(tree24,254,355);
        Tree1 tree18 = new Tree1();
        addObject(tree18,524,86);
        Tree2 tree25 = new Tree2();
        addObject(tree25,254,27);
        Tree1 tree19 = new Tree1();
        addObject(tree19,398,20);
        tree19.setLocation(421,3);
    }
}
