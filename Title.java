import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Starting screen
 * 
 * @author Rick
 * @version 1
 */
public class Title extends World
{

    /**
     * Constructor for objects of class Title.
     * 
     */
    public Title()
    {    
        // Create a new world with cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
    }

    
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {  
            TipsScreen tps = new TipsScreen();
                
                    
            Greenfoot.setWorld(tps);
            
        }
        
        menuOpening();

    }
    public void menuOpening()
    {
        boolean isOpen = false;
        Actor mn;
        if(Greenfoot.isKeyDown("x") && isOpen == false){
            Menu sa = new Menu();
            addObject(sa, 400, 300);
            MenuSelector slc = new MenuSelector();
            mn = slc;
            addObject(slc, 179, 89);
            setActOrder(Menu.class, MenuSelector.class);
            isOpen = true;
            //removes duplicates
            if(getObjects(MenuSelector.class).size() == 2){
                removeObject(getObjects(MenuSelector.class).get(1));
            }
        }
        
      
    }
}