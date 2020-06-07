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
        int y = (int)(Math.random()*700+10);
        int x = (int)(Math.random()*1200+10);
        for(int i=0;i<499;i++) {
            addObject( new Human(this.getWidth(),this.getHeight()), x, y);
            y = (int)(Math.random()*700+10);
            x = (int)(Math.random()*1250+10);
        }
        addObject( new Human(this.getWidth(),this.getHeight(),1), x, y);
        Greenfoot.start();
    }
}
