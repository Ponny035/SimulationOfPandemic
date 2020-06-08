import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SocialDistancing extends Button
{
    private boolean isPick;
    private GreenfootImage imagePick;
    private GreenfootImage imageUnPick;
    private String pick;
    private String unPick;
    private int Social = 1;
    public SocialDistancing(String pick,String unPick) {
        this.pick = pick;
        this.unPick = unPick;
        imageUnPick = new GreenfootImage(unPick);
        imagePick = new GreenfootImage(pick);
        setImage(imageUnPick);
    }
    /**
     * Act - do whatever the Map wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    } 
    
    public void checkSocialDistancing(int speed) {
        isPick = ((SelectEnvironment)getWorld()).SocialDistancing(speed);
    }
    
    public void changePicture() {
        if(isPick) {
            setImage(pick);
        }
        else {
            setImage(imageUnPick);
        }
    }
    
    public void click(int speed) {
        super.checkClick();
        if(isActive) {
            ((SelectEnvironment)getWorld()).setSpeed(speed);
        }
        isActive = false;
    }
}
