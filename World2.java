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
    
    //hp bar
    Hearts hp1 = new Hearts();
    Hearts hp2 = new Hearts();
    Hearts hp3 = new Hearts();
    
    Random rdm = new Random();
    //text
    Textbox c = new Textbox();
    Text5 five = new Text5();
    SimpleTimer textTimer3 = new SimpleTimer();
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
        
        
       
        
        //light overlay        
        lightCircle = new Spotlight();
        addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
        //score counter
        tmsc = new Label(z, 50);
        addObject(tmsc, 75, 50);
        
        //hp hearts      
        addObject(hp1, 650, 50);
        addObject(hp2, 700, 50);
        addObject(hp3, 750, 50);
        
        //text
        addObject(c, 400, 450); 
        addObject(five, 420, 530);
    }
    public void act()
    {
        //timer
        
        timerScore();
        
        scoreCounter.mark(); 
        
        //Sets light circle to follow actor
        lightCircle.setLocation(scrollActor.getX(), scrollActor.getY() + 80);
        
        if(textTimer3.millisElapsed() < 1500){
            return;
        }
        removeObject(five);
        removeObject(c);
        
        loseLife();
    }
    /**
     * 
     */
    public void timerScore(){
        z++;
        tmsc.setValue(z);
        //spawns new ghosts
        if(z % 500 == 0)
        {
            Ghost ke = new Ghost();
            removeObject(lightCircle);
            removeObject(tmsc);
            removeObject(hp1);
            removeObject(hp2);
            removeObject(hp3);
            addObject(ke, rdm.nextInt(800), rdm.nextInt(600));
            addObject(lightCircle, scrollActor.getX(), scrollActor.getY() + 80);
            addObject(tmsc, 75, 50);
            
            addHearts();
            
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
    public void addHearts()
    {
        if(Chara.lives == 3){
            addObject(hp1, 650, 50);
            addObject(hp2, 700, 50);
            addObject(hp3, 750, 50);
        }
        if(Chara.lives == 2){
            addObject(hp1, 650, 50);
            addObject(hp2, 700, 50);
            
        }
        if(Chara.lives == 1){
            addObject(hp1, 650, 50);
        
        }
    }
    
}