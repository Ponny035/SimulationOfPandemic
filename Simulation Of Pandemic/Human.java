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
    private int walkingDirection = 0;
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
                walkingDirection = (int)((Math.random()*4));
            }
            walk(walkingDirection);
            countWalk = 0;
        }
        else {
            walk(walkingDirection);
            countWalk++;
        }
    }
    
    private void walk(int direction) {
        int x = getX();
        int y = getY();
        switch(direction) {
            case 0:
                if((x-(humanWidth/2))>0) {
                    setLocation(x-2, y);
                }
                else {
                    setLocation(x+2, y);
                }
                break;
            case 1:
                if((x+(humanWidth/2))<worldWidth) {
                    setLocation(x+2, y);
                }
                else {
                    setLocation(x-2, y);
                }
                break;
            case 2:
                if((y-(humanHeight/2))>0) {
                    setLocation(x, y-2);
                }
                else {
                    setLocation(x, y+2);
                }
                break;
            case 3:
                if((y+(humanHeight/2))<worldHeight) {
                    setLocation(x, y+2);
                }
                else {
                    setLocation(x, y-2);
                }
                break;
        }
    }
}
