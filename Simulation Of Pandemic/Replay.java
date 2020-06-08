import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Replay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Replay extends Button
{
    /**
     * Act - do whatever the Replay wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Replay() {
        super("Button/retry.png");
    }
    
    public void act() 
    {
        super.checkClick();
        active(isActive);
    }    
    
    private void active(boolean active) {
        if(active) {
            World world = getWorld();
            //Greenfoot.playSound("Selection_Sound_7.wav");
            //world.soundTrack.stop();
            Greenfoot.setWorld(new HomeScreen());
            //Greenfoot.setWorld(new SelectEnvironment());
            getWorld().removeObject(this);
        }
    }
}
