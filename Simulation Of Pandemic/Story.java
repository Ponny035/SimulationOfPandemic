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
        super.checkKeys("enter");
        //active(isActive);
    }    
    
    /*private void active(boolean active) {
        if(active) {
            Greenfoot.playSound("");
            Greenfoot.setWorld(new ....());
            getWorld().removeObject(this);
        }
    }*/
}
