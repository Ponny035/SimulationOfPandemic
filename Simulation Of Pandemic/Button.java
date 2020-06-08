import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main template for all Button
 * 
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 1.0.0
 */
public class Button extends Actor
{
    private GreenfootImage image;
    public boolean isActive = false;
    private boolean toggle = false;
    
    public Button() {
    
    }
   
    public Button(String img) {
        image = new GreenfootImage(img);
        setImage( image );
    }
    
    public Button(String img ,int width, int height) {
        image = new GreenfootImage(img);
        image.scale(width, height);
        setImage( image );
    }
    
    public void checkClick() {
        if (Greenfoot.mouseClicked(this)) {
            isActive = true;
        }
    } 
    
    public void checkKeys(String key) {
        if (Greenfoot.isKeyDown(key)) {
            if(!(toggle)) {
                isActive = true;
                toggle = true;
            }
        }
        else {
            toggle = false;
        }
    } 
}
