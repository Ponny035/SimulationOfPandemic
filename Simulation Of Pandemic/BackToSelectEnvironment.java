import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_Homescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackToSelectEnvironment extends Button {
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.checkClick();
        super.checkKeys("backspace");
        active(isActive);
    } 
    
    public void active (boolean active) {
        if(active) {
            //Greenfoot.playSound("");
            //((Home)getWorld()).soundTrack.stop();
            Greenfoot.setWorld(new SelectEnvironment());
            getWorld().removeObject(this);
        }
    }
    
    public BackToSelectEnvironment() {
        super("images/Button/button_back.png");
    
    }
}
