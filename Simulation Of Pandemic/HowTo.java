import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Notice here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowTo extends Button
{
    /**
     * Act - do whatever the Notice wants to do. This method is called whenever
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
            Greenfoot.setWorld(new HowToPlay());
            getWorld().removeObject(this);
        }
    }
    
    public HowTo() {
        super("images/button_notice.png");
    
    }  
}
