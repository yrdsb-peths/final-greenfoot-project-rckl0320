import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuSelector extends Actor
{
    /**
     * Act - do whatever the MenuSelector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int sy = 100;
    int fx = 100; //position of menu options, fixed
    public void act()
    {
        sy = 100;
        if(sy == 100){
                System.out.println("100");
                if(Greenfoot.isKeyDown("Up")){
                    setLocation(fx, 500);
                    sy = 500;
                    System.out.println("up1");
                    
                }
                if(Greenfoot.isKeyDown("Down")){
                    setLocation(fx, 200);
                    sy = 200;
                    System.out.println("down1");
                   
                }
        }          
        else if(sy == 200){
                System.out.println("200");
                if(Greenfoot.isKeyDown("Up")){
                    setLocation(fx, 100);
                    sy = getY();
                   
                }
                if(Greenfoot.isKeyDown("Down")){
                    setLocation(fx, 300);
                    sy = getY();
                
                }
        }
        else if(sy == 300){
                System.out.println("300");
                if(Greenfoot.isKeyDown("Up")){
                    setLocation(fx, 200);
                    sy = getY();
                
                }
                if(Greenfoot.isKeyDown("Down")){
                    setLocation(fx, 500);
                    sy = getY();
    
                }
        }    
        
        else if(sy == 500){
                System.out.println("500");
                if(Greenfoot.isKeyDown("Up")){
                    setLocation(fx, 300);
                    sy = getY();
                }
                if(Greenfoot.isKeyDown("Down")){
                    setLocation(fx, 100);
                    sy = getY();
                }
           
                
        }
    }
}
