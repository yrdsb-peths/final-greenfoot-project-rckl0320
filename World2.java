import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main game world
 * 
 * Avoid the ghost for as long as you can
 *  
 * @author Rick
 */
public class World2 extends World
{
    public static final int WIDE = 800;
    public static final int HIGH = 600;
    
    public int lives = 3;
    Actor scrollActor;
    Actor lightCircle;
    Ghost ko = new Ghost();
    SimpleTimer scoreCounter = new SimpleTimer();
    int z = 0;
    Label tmsc;
    //number of ghosts
    int ghostNum = 1;
    
    public World2()
    {
        super(800, 600, 1, true);
        scoreCounter.mark();
        
        //Player character
        scrollActor = new Chara();
        addObject(scrollActor, 400, 500);
        
        
        addObject(ko, 100, 100);
        Well udgw = new Well();
        addObject(udgw, 700, 500);
        
        lightCircle = new Spotlight();
        addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
        
        tmsc = new Label(z, 75);
        addObject(tmsc, 100, 100);
    
        
    }
    public void act()
    {
        //timer
        
        timerScore();
        
        scoreCounter.mark(); 
        
        //Sets light circle to follow actor
        lightCircle.setLocation(scrollActor.getX(), scrollActor.getY() + 80);
        
        //Respawns Ghost
        int ghostNum = 1;
        if(getObjects(Ghost.class).size() == ghostNum - 1){
            lives--;
            addObject(ko, 100, 300);
            ghostNum++;
        }
        //Ends game when lives run out
        if(lives == 0){
            //Chara.death();
            End gmov = new End();
            Greenfoot.setWorld(gmov);
        }
    }
    public void timerScore(){
        z++;
        tmsc.setValue(z);
        if(z % 1000 == 0)
        {
            Ghost ke = new Ghost();
            addObject(ke, 500, 500);
            ghostNum++;
        }
        
    }
    

}