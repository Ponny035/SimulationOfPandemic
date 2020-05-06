import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 * 
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 0.1.0
 */
public class Human extends Actor
{
    private GreenfootImage image;
    private int width;
    private int height;
    private int worldWidth;
    private int worldHeight;
    
    public Human () {
        this ("images/normal.png", 20, 20);
    }
        
    public Human (String skin, int width, int height) {
        this.width = width;
        this.height = height;
        //this.worldWidth = ((StartWorld)getWorld()).getWidth();
        //this.worldHeight = ((StartWorld)getWorld()).getHeight();
        image = new GreenfootImage(skin);
        image.scale(width, height);
        setImage(image);
    }
    
    public void act() 
    {
       walk();
    }
    
    private void walk() {
        int x = getX();
        int y = getY();
        
        int direction = (int)((Math.random()*4));
        System.out.println(direction);
        switch (direction) {
            case 0:
                if((x-(width/2))>0) {
                    setLocation(x-2, y);
                }
                break;
            case 1:
                if((x+(width/2))<1280) {
                    setLocation(x+2, y);
                }
                break;
            case 2:
                if((y-(height/2))>0) {
                    setLocation(x, y-2);
                }
                break;
            case 3:
                if((y+(height/2))<720) {
                    setLocation(x, y+2);
                }
                break;
        }
    }
}
