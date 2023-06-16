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

    public Forest(int firstTime)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(WIDE, HIGH, 1, false);
        GreenfootImage bg = new GreenfootImage("background 1.png");
        int bgWide = bg.getWidth();
        int bgHigh = bg.getHeight();
        scroller = new Scroller(this, bg, bgWide, bgHigh);
        scrollActor = new Chara();

        if(firstTime == 0){
            addObject(scrollActor, 300, 600);    
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
        Tree2 tree214 = new Tree2();
        addObject(tree214,50,-150);
        Tree1 tree114 = new Tree1();
        addObject(tree114,20,-60);
        //top left corner
        Tree1 tree1 = new Tree1();
        addObject(tree1,54,36);
        Tree2 tree2 = new Tree2();
        addObject(tree2,45,125);
        Tree1 tree12 = new Tree1();
        addObject(tree12,38,227);
        Tree1 tree13 = new Tree1();
        addObject(tree13,64,320);
        Tree2 tree22 = new Tree2();
        addObject(tree22,46,400);
        Tree1 tree14 = new Tree1();
        addObject(tree14,70,475);
        Tree2 tree23 = new Tree2();
        addObject(tree23, 30,563);

        //bottom left corner
        Tree1 tree15 = new Tree1();
        addObject(tree15,190,540);
        Tree2 tree24 = new Tree2();
        addObject(tree24,304,567);
        Tree1 tree16 = new Tree1();
        addObject(tree16,420,561);
        Tree2 tree25 = new Tree2();
        addObject(tree25,530,550);
        Tree1 tree17 = new Tree1();
        addObject(tree17,650,558);
        Tree2 tree26 = new Tree2();
        addObject(tree26,527,391);
        //top right corner
        Tree2 tree27 = new Tree2();
        addObject(tree27,751,21);
        Tree2 tree28 = new Tree2();
        addObject(tree28,767,123);
        Tree1 tree18 = new Tree1();
        addObject(tree18,730,210);
        Tree2 tree29 = new Tree2();
        addObject(tree29,640,320);

        Tree2 tree86 = new Tree2();
        addObject(tree86,750,302);

        Tree1 tree19 = new Tree1();
        addObject(tree19,739,406);
        Tree2 tree210 = new Tree2();
        addObject(tree210,750,497);
        Tree1 tree110 = new Tree1();
        addObject(tree110,742,584);
        Tree1 tree111 = new Tree1();
        addObject(tree111,635,442);

        Tree1 tree112 = new Tree1();
        addObject(tree112,570,57);
        Tree2 tree211 = new Tree2();
        addObject(tree211,643,138);
        Tree2 tree212 = new Tree2();
        addObject(tree212,576,201);
        Tree1 tree113 = new Tree1();
        addObject(tree113,431,114);

        Tree2 tree213 = new Tree2();
        addObject(tree213,200,0);

        Tree1 tree115 = new Tree1();
        addObject(tree115,420,436);

        Tree1 tr = new Tree1();
        addObject(tr, 160, 70);

        Tree2 tree216 = new Tree2();
        addObject(tree216,166,196);
    }
}
