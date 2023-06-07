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
     * Constructor for objects of class World1.
     * 
     */
    public World1(int x, int y)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(816, 624, 1, true); 
        
        //Chara player1 = new Chara();
        //addObject(player1, 500, 200);
        
        Wall w = new Wall();
        addObject(w, 400, 500);
        
        WorldChange b = new WorldChange();
        addObject(b, getWidth()/2, 10);
    }
    
}
