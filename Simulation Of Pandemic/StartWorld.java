import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 0.1.0
 */
public class StartWorld extends World
{    
    public StartWorld() {
        this(1280,720);
    }
    
    public StartWorld(int width, int height)
    {
        super(width, height, 1);
        addObject( new Human(this.getWidth(),this.getHeight()), 640, 360);
        Greenfoot.start();
    }
}
