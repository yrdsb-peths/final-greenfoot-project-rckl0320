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
    
    public int lives = 3;
    Actor scrollActor;
    Actor lightCircle;
    Ghost ko = new Ghost();
    SimpleTimer scoreCounter = new SimpleTimer();
    int z = 0;
    Label tmsc;
    public World2()
    {
        super(800, 600, 1, true);
        scoreCounter.mark();
        
       
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
        if(scoreCounter.millisElapsed() == 1000){
            timerScore();
        }
        scoreCounter.mark(); 
        
        //Sets light circle to follow actor
        lightCircle.setLocation(scrollActor.getX(), scrollActor.getY() + 80);
        
        //Respawns Ghost 
        if(getObjects(Ghost.class).isEmpty()){
            addObject(ko, 100, 300);
            lives -= 1;
        }
        
        //Ends game when lives run out
        if(lives == 0){
            //Chara.death();
            End gmov = new End();
            Greenfoot.setWorld(gmov);
        }
    }
    public void timerScore(){
        z += 1;
        tmsc.setValue(z);
        
    }
    

}