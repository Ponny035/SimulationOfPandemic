import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class down2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ImmuneDown extends Button
{
    /**
     * Act - do whatever the down2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.checkClick();
        active(isActive);
    } 
    
    public void active (boolean active) {
        if(active) {
            //Greenfoot.playSound("Selection_Sound_1.wav");
            double immune = ((SelectEnvironment)getWorld()).getImmune();
            if(immune>0.4) {
                immune= immune-0.1;
            }
            ((SelectEnvironment)getWorld()).setImmune(immune);
            isActive = false;
        }
    }
    
    public ImmuneDown() {
        super("images/Button/botton_down.png");
    
    }    
}
