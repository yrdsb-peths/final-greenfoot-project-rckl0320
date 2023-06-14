import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blackScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FadeScreen extends Actor
{
    /**
     * Act - do whatever the blackScreen wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        getImage().setTransparency(100);
    }
    
    public void fadeIn()
    {
        for(int i=0; i < 255; i+=2){
            
            getImage().setTransparency(i);
            try{
                Thread.sleep(1);
            }
            catch (InterruptedException x){
                Thread.currentThread().interrupt();
            }
        }
    }
    public void fadeOut()
    {
        for(int i=0; i < 255; i--){
            
            getImage().setTransparency(i);
    
        }  
    }
}
