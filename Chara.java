import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Player controlled character
 * 
 * @author Rick L 
 * @version June 2023
 * 
 */
public class Chara extends Actor
{
    /**
     * 
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        collisionDetector();
        worldChanger();
        interaction();
        GreenfootImage cr = getImage();
        cr.scale(64, 64);
    }
    /**
     * Detects Collisions and controls movement
     */
    public void collisionDetector()
    {
        //Variables for collision detection
        
        int rotation1 = 1;
        int rotation2 = 1;
        int posX = 0;
        int posY = 0;
        int speed = 2;
        
        //collision detector
        if(isTouching(Wall.class)){
            if(rotation1 == 1){
                rotation1 = getRotation();
                posX = getX();
                posY = getY();
            }
        }
        else{
            rotation1 = 1;
            rotation2 = 1;
            posX = 0;
            posY = 0;
        }
        
        //Movement and collision input
        if (Greenfoot.isKeyDown("up")){
            setRotation(270);
            
            rotation2 = getRotation();
            
            if(rotation2 != rotation1){
                move(speed);
            }
            else if(rotation2 == rotation1){
                setLocation(posX, posY);
            }
            
        }
        else if (Greenfoot.isKeyDown("down")){
            setRotation(90);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){   
                move(speed);
            }
            else if(rotation2 == rotation1){
                setLocation(posX, posY);
            }
        }
        else if (Greenfoot.isKeyDown("left")){
            setRotation(180);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){
                move(speed);
            }
            else if(rotation2 == rotation1){
                setLocation(posX, posY);
            }
        }
        
       
        else if (Greenfoot.isKeyDown("right")){
            setRotation(0);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){            
                move(speed);
            }
            else if(rotation2 == rotation1){
                setLocation(posX, posY);
            }
        }
    }
    
    
    /**
     * Allows switching between different worlds
     */
    public void worldChanger()
    {
        //Allows world changes upon contact with WorldChange objects 
        if(isTouching(WorldChange.class)){
            
            //allows travel back from World1 to World2
            if(getWorld() instanceof World1){
                World2 worl = new World2();
                //worl.addObject(this, worl.getWidth()/2, 100);
                
                Greenfoot.setWorld(worl);
            }
        }   
    }
    
    /**
     * Allows for interaction between Character and objects
     */
    public void interaction()
    {
        if(isTouching(Well.class)){
            if(Greenfoot.isKeyDown("z")){
                
                World1 wor = new World1();
                wor.addObject(this, wor.getWidth()/2, 590);
               
                Greenfoot.setWorld(wor);
                
            }
        }
    }
}
