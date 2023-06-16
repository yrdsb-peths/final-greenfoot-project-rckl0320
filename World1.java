import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World1 extends World
{
    GreenfootImage[] bg = new GreenfootImage[4];
    SimpleTimer bgAnimation = new SimpleTimer();
    /**
     * Constructor for objects of class World1.
     * 
     */
    public World1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        for(int i=0; i<bg.length; i++)
        {
            bg[i] = new GreenfootImage("images/well_bg/well" + i + ".png");

        }
        bgAnimation.mark();
        setBackground(bg[0]);
        prepare();
    }

    int imgIndx = 0;
    public void animateBackground()
    {   
        if(bgAnimation.millisElapsed() < 300){
            return;
        }
        bgAnimation.mark(); 
        setBackground(bg[imgIndx]);
        imgIndx = (imgIndx + 1) % bg.length;

    }

    public void act()
    {
        animateBackground();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall,291,537);
        Wall wall2 = new Wall();
        addObject(wall2,502,541);
        Wall wall3 = new Wall();
        addObject(wall3,500,437);
        Wall wall4 = new Wall();
        addObject(wall4,504,273);
        Wall wall5 = new Wall();
        addObject(wall5,501,172);
        Wall wall6 = new Wall();
        addObject(wall6,500,63);
        Wall wall7 = new Wall();
        addObject(wall7,291,427);
        Wall wall8 = new Wall();
        addObject(wall8,294,285);
        Wall wall9 = new Wall();
        addObject(wall9,296,195);
        Wall wall10 = new Wall();
        addObject(wall10,291,68);
        WorldChange worldChange = new WorldChange();
        addObject(worldChange,394,19);
        worldChange.setLocation(393,19);
        worldChange.setLocation(394,-1);
    }
}
