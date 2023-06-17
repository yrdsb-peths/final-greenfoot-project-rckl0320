import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
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
    
    //player character
    Actor scrollActor;
    //light overlay
    Actor lightCircle;
    
    //score timer
    SimpleTimer scoreCounter = new SimpleTimer();
    
    int z = 0;
    Label tmsc;
    
    //number of ghosts
    int ghostNum = 1;
    //Health
    //hp bar
    Hearts hp1 = new Hearts();
    Hearts hp2 = new Hearts();
    Hearts hp3 = new Hearts();
    
    Random rdm = new Random();
    public World2()
    {
        super(800, 600, 1, true);
        scoreCounter.mark();
        
        //Player character
        scrollActor = new Chara();
        addObject(scrollActor, 400, 500);
        
        //First ghost
        Ghost ko = new Ghost();
        addObject(ko, 100, 100);
        
        
        Well udgw = new Well();
        addObject(udgw, 700, 500);
        
        //light overlay        
        lightCircle = new Spotlight();
        addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
        //score counter
        tmsc = new Label(z, 50);
        addObject(tmsc, 75, 50);
        
        
        addObject(hp1, 650, 50);
        addObject(hp2, 700, 50);
        addObject(hp3, 750, 50);
        
        
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
            Ghost ka = new Ghost();
            removeObject(lightCircle);
            
            addObject(ka, rdm.nextInt(800), rdm.nextInt(600));
            addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
            ghostNum++;
        }
        loseLife();
    }
    /**
     * 
     */
    public void timerScore(){
        z++;
        tmsc.setValue(z);
        if(z % 500 == 0)
        {
            Ghost ke = new Ghost();
            removeObject(lightCircle);
            
            addObject(ke, rdm.nextInt(800), rdm.nextInt(600));
            addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
            ghostNum++;
        }
        if(z % 2000 == 0){
            Ghost.spd++;
        }
    }
    
    public void loseLife()
    {
        int li = Chara.lives;
        if(li == 2){
            removeObject(hp3);
        }
        if(li == 1){
            removeObject(hp2);
        }
        if(li == 0){
            //Chara.death();
            End gmov = new End();
            Greenfoot.setWorld(gmov);
        }
    }
    
    
}