import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesSocialDistancing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoNotSocialDistancing extends SocialDistancing
{
    public DoNotSocialDistancing() {
        super("images/Button/nosocial_on_click.png","images/Button/nosocial.png");
    }
    /**
     * Act - do whatever the MiniMap1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        click(10);
        checkSocialDistancing(10);
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
