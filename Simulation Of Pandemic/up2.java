import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class up2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class up2 extends Button
{
    /**
     * Act - do whatever the up2 wants to do. This method is called whenever
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
    
    public up2() {
        super("images/botton_up.png");
    
    }   
}
