import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Do_Noclick_SD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Do_Noclick_SD extends Button
{
    /**
     * Act - do whatever the Do_Noclick_SD wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.checkClick();
        active(isActive);
    } 
    
    public void active (boolean active) {
        if(active) {
            //Greenfoot.playSound("");
            //((Home)getWorld()).soundTrack.stop();
            //Greenfoot.setWorld(new HomeScreen());
            getWorld().removeObject(this);
        }
    }
    
    public Do_Noclick_SD() {
        super("images/button_dosocial_noclick.png");
    
    }  
}
