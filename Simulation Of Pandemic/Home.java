import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends Button
{
    /**
     * Act - do whatever the Home wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Home() {
        super("Button/home.png");
    }
    
    public void act() 
    {
        super.checkClick();
        super.checkKeys("enter");
        active(isActive);
    }    
    
    private void active(boolean active) {
        if(active) {
            World world = getWorld();
            //Greenfoot.playSound("Selection_Sound_7.wav");
            //world.soundTrack.stop();
            Greenfoot.setWorld(new HomeScreen());
            getWorld().removeObject(this);
        }
    }
}
