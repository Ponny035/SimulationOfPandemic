import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back_Select here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackSelect extends Button
{
    /**
     * Act - do whatever the Back_Select wants to do. This method is called whenever
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
            Greenfoot.setWorld(new HomeScreen());
            getWorld().removeObject(this);
        }
    }
    
    public BackSelect() {
        super("images/botton_backtohomepage.png");
    
    }   
}
