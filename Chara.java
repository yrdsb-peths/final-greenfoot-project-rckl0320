import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Player controlled character
 * 
 * @author Rick L 
 * @version June 2023
 */
public class Chara extends Actor
{
    /**
     * Act - do whatever the Character wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //Variables for collision detection
        
        int rotation1 = 1;
        int rotation2 = 1;

        
        //collision detector
        if(isTouching(Wall.class)){
            
            if(rotation1 == 1){
                rotation1 = getRotation();
            }
        }
        else{
            rotation1 = 1;
            rotation2 = 1;
        }
        
        //Movement and collision input
        if (Greenfoot.isKeyDown("up")){
            setRotation(270);

            rotation2 = getRotation();
            
            if(rotation2 != rotation1){
                
                move(2);
            }
            
        }
        else if (Greenfoot.isKeyDown("down")){
            setRotation(90);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){   
                move(2);
            }
        }
        else if (Greenfoot.isKeyDown("left")){
            setRotation(180);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){       
                move(2);
            }
        }
        
       
        else if (Greenfoot.isKeyDown("right")){
            setRotation(0);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){            
                move(2);
            }
        }
        
        
        
        
        
        //Allows world changes upon contact with WorldChange objects 
        if(isTouching(WorldChange.class)){
            
            //allows travel to World1 from MyWorld
            if(getWorld() instanceof MyWorld){
                World1 wor = new World1();
                wor.addObject(this, wor.getWidth()/2, 500);
                    
                Greenfoot.setWorld(wor);
            }
            
            //allows travel back from World1 to MyWorld
            else if(getWorld() instanceof World1){
                MyWorld worl = new MyWorld();
                worl.addObject(this, worl.getWidth()/2, 55);
                
                Greenfoot.setWorld(worl);
            }
        }
        
        
        
        if(isTouching(Interaction.class)){
            if(Greenfoot.isKeyDown("z")){
                //actions after the interaction
                
            }
        }
        
    }
    

}
