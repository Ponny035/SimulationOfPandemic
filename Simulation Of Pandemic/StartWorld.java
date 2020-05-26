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
        addObject( new Human(this.getWidth(),this.getHeight()), 650, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 620, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 550, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 500, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 450, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 400, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 350, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 300, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 250, 360);
        addObject( new Human(this.getWidth(),this.getHeight()), 200, 360);
        Greenfoot.start();
    }
}
