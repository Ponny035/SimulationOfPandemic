import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class up2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImmuneUp extends Button
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
    
    private void active(boolean active) {
        if(active) {
            //Greenfoot.playSound("Selection_Sound_1.wav");
            double immune = ((SelectEnvironment)getWorld()).getImmune();
            if(immune<0.9) {
                immune= immune+0.1;
            }
            ((SelectEnvironment)getWorld()).setImmune(immune);
            isActive = false;
        } 
    }
    
    public ImmuneUp() {
        super("images/Button/botton_up.png");
    
    }   
}
