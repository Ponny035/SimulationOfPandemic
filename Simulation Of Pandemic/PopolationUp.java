import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class up1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PopolationUp extends Button
{
    /**
     * Act - do whatever the up1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.checkClick();
        active(isActive);
    } 
    
    private void active(boolean active) {
        if(active) {
            //Greenfoot.playSound("Selection_Sound_1.wav");
            int people = ((SelectEnvironment)getWorld()).getPeople();
            if(people<500) {
                people= people+100;
            }
            ((SelectEnvironment)getWorld()).setPeople(people);
            isActive = false;
        } 
    }
    
    public PopolationUp() {
        super("images/Button/botton_up.png");
    
    }  
}
