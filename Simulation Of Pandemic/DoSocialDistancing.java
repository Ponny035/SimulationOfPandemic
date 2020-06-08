import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesSocialDistancing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoSocialDistancing extends SocialDistancing
{
    public DoSocialDistancing() {
        super("images/Button/dosocial_on_click.jpg","images/Button/dosocial.png");
    }
    /**
     * Act - do whatever the MiniMap1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click(2);
        checkSocialDistancing(2);
        changePicture();
        super.checkClick();
        active(isActive);
    } 
    
    private void active(boolean active) {
        if(active) {
            //Greenfoot.playSound("Selection_Sound_8.wav");
        } 
    }    
}
