import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Actor
{
    /**
     * Act - do whatever the Menu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int selectorY;
    public void act()
    {
        getWorld().addObject(new MenuSelector(), 100, 100);
        
        //Selection detection for menu
        switch(selectorY){
            case 100:
                if(Greenfoot.isKeyDown("z")){
                    
                }
                break;
                
            case 200:
                if(Greenfoot.isKeyDown("z")){
                    
                }
                break;
            
            case 300:
                if(Greenfoot.isKeyDown("z")){
                    
                }
                break;
            
        }
    }
}
