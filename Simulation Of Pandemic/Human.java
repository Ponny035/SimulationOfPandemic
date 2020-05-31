import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 0.2.0
 */
public class Human extends Actor
{
    private GreenfootImage image;
    private int humanWidth;
    private int humanHeight;
    private int worldWidth;
    private int worldHeight;
    private double walkingDirection = 0;
    private int countWalk = 0;

    public Human(int worldWidth, int worldHeight) {
        this("images/normal.png", 20, 20, worldWidth, worldHeight);
    }
    
    public Human(String skin, int humanWidth, int humanHeight,int worldWidth, int worldHeight) {
        this.humanWidth = humanWidth;
        this.humanHeight = humanHeight;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
        image = new GreenfootImage(skin);
        image.scale(humanWidth, humanHeight);
        setImage(image);
    }

    public void act()
    {
       travel();
    }
    
    private void travel() {
        if(countWalk>5) {
            double threshold = 0.75;
            double decision = Math.random();
            if(decision>threshold) {
                walkingDirection = (Math.random()*2*Math.PI);
            }
            walk(walkingDirection);
            countWalk = 0;
        }
        else {
            walk(walkingDirection);
            countWalk++;
        }
    }
    
    private void walk(double direction) {
        int x = getX();
        int y = getY();
        setLocation(x+(int)(2*Math.cos(direction)), y+(int)(2*Math.sin(direction)));
    }
}
