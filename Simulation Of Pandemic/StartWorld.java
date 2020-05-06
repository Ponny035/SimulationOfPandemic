import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 0.1.0
 */
public class StartWorld extends World
{
    private int width;
    private int height;
    
    public StartWorld() {
        this(1280,720);
    }
    
    public StartWorld(int width, int height)
    {
        super(width, height, 1);
        this.width = width;
        this.height = height;
        addObject( new Human(), 640, 360);
        Greenfoot.start();
    }
    
    public int getWidth () {
        return width;
    }
    
    public int getHeight () {
        return height;
    }
}
