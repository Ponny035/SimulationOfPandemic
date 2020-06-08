import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Button
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.checkClick();
        super.checkKeys("enter");
        active(isActive);
    } 
    
    public void active (boolean active) {
        if(active) {
            //Greenfoot.playSound("");
            //((Home)getWorld()).soundTrack.stop();
            Greenfoot.setWorld(new SimulationWorld());
            //Greenfoot.setWorld(new SelectEnvironment());
            getWorld().removeObject(this);
        }
    }
    
    public Start() {
        super("images/Button/Button_Start.png");
    
    }
}
