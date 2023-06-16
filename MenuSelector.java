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
    int fx = 200; //horizontal position of menu options, fixed
    boolean isOn = true;
    public void act()
    {
        sy = 100;
        if(isOn){
            sy = getY();
            
        }
        if(sy == 100){ 
            
            if(Greenfoot.isKeyDown("Up")){
                setLocation(fx, 500);
                sy = getY();
                    
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException x){
                    Thread.currentThread().interrupt();
                    setLocation(fx, 500);
                }
            }
            if(Greenfoot.isKeyDown("Down")){
                setLocation(fx, 200);
                sy = getY();
                    
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException x){
                    
                    Thread.currentThread().interrupt();
                    setLocation(fx, 200);
                }
            }
        }          
        else if(sy == 200){
               
            if(Greenfoot.isKeyDown("Up")){
                setLocation(fx, 100);
                sy = getY();
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException x){
                    Thread.currentThread().interrupt();
                    setLocation(fx, 100);
                }
            }
            if(Greenfoot.isKeyDown("Down")){
                setLocation(fx, 300);
                sy = getY();
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException x){
                    Thread.currentThread().interrupt();
                    setLocation(fx, 300);
                }
            }
        }
        
        else if(sy == 500){
                
            if(Greenfoot.isKeyDown("Up")){
                setLocation(fx, 300);
                sy = getY();
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException x){
                    Thread.currentThread().interrupt();
                    setLocation(fx, 300);
                }
            }
            if(Greenfoot.isKeyDown("Down")){
                setLocation(fx, 100);
                sy = getY();
                try{
                    Thread.sleep(200);
                }
                catch (InterruptedException x){
                    Thread.currentThread().interrupt();
                    setLocation(fx, 100);
                }
            }
           
                
        }
           
    }
}
