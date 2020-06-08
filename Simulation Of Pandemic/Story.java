import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Story here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Story extends Button
{

    public Story() { 
        super("images/Button/button_story.png");
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
            Greenfoot.setWorld(new COVIDStory());
            getWorld().removeObject(this);
        }
    }
}
