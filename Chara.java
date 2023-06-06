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
        int tracker = 0;
        int rotation1 = 1;
        int rotation2 = 1;

        
        //collision detector
        if(isTouching(Wall.class)){
            tracker = 1;
            
            if(rotation1 == 1){
                rotation1 = getRotation();
            }
        }
        else{
            //if((getRotation() != 270) && (getRotation() != 90)){
            rotation1 = 1;
            rotation2 = 1;
            //}
        }
        
        //Movement and collision input
        if (Greenfoot.isKeyDown("up")){
            setRotation(270);

            rotation2 = getRotation();
            
            if(rotation2 != rotation1){
                
                move(3);
            }
            
        }
        else if (Greenfoot.isKeyDown("down")){
            setRotation(90);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){   
                move(3);
            }
        }
        else if (Greenfoot.isKeyDown("left")){
            setRotation(180);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){       
                move(3);
            }
        }
        
       
        else if (Greenfoot.isKeyDown("right")){
            setRotation(0);
            
            rotation2 = getRotation();

            if(rotation2 != rotation1){            
                move(3);
            }
        }
        
        //detects places to change world 
        if(isTouching(WorldChange.class)){
            System.out.println("s");
            WorldChange.toWorld(getX(), 300, "MyWorld", 1);
        }


    }
    
}
