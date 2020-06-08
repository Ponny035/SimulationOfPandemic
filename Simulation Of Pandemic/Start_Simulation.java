import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start_Simulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start_Simulation extends Button
{
    /**
     * Act - do whatever the Start_Simulation wants to do. This method is called whenever
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
            Greenfoot.setWorld(new SimulationWorld());
            getWorld().removeObject(this);
        }
    }
    
    public Start_Simulation() {
        super("images/button_startsimulation.png");
    
    }
}
