import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Human here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 0.2.1
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
    private int infectionStage;
    private int infectionPeriod;
    private int recoverPeriod;
    private double immume;
    private double recoveryThreshold = 1;

    public Human(int worldWidth, int worldHeight) {
        this("images/normal.png", 20, 20, worldWidth, worldHeight,0, 50, 0.75);
    }
    
    public Human(int worldWidth, int worldHeight, int infectionStage) {
        this("images/normal.png", 20, 20, worldWidth, worldHeight,infectionStage, 50, 0.75);
    }

    public Human(String skin, int humanWidth, int humanHeight,int worldWidth, int worldHeight, int infectionStage, int recoverPeriod, double immume) {
        this.humanWidth = humanWidth;
        this.humanHeight = humanHeight;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
        this.infectionStage = infectionStage;
        this.recoverPeriod = recoverPeriod;
        this.immume = immume;
        image = new GreenfootImage(skin);
        image.scale(humanWidth, humanHeight);
        setImage(image);
    }
    
    public int getInfectionStage() {
        return infectionStage;
    }
    
    private void checkspread() {
        List<Human>objects = getObjectsInRange(30, Human.class);
        for (Human h : objects) 
        { 
            double p = Math.random();
            if (p>immume) {
                if(getInfectionStage()==2){
                    recoveryThreshold = 1;
                    recoverPeriod = 50;
                    infectionPeriod = 0;
                }
                h.changeStage(0);
            }
        }
    }
    
    public void gotInfection () {
        changeStage(infectionStage);
    }

    public void act()
    {
       travel();
       if (infectionStage == 1) {
           checkspread();
           checkRecovery();
       }
    }

    private void checkRecovery() {
        if(infectionPeriod > recoverPeriod) {
            double recover = Math.random();
            if(recover>recoveryThreshold) {
                changeStage(infectionStage);
                immume = 0.99;
            }
            else {
                recoveryThreshold = recoveryThreshold * 0.99;
            }
            recoverPeriod = (int)(recoverPeriod * 0.9);
            infectionPeriod = 0;
        }
        else {
            infectionPeriod++;
        }
    }

    private void changeStage(int Stage) {
        switch(Stage) {
            case 0:
                infectionStage = 1;
                image = new GreenfootImage("images/infected.png");
                image.scale(humanWidth, humanHeight);
                setImage(image);
                break;
            case 1:
                infectionStage = 2;
                image = new GreenfootImage("images/recover.png");
                image.scale(humanWidth, humanHeight);
                setImage(image);
                break;
        }
    }

    private void travel() {
        if(countWalk>5) {
            double threshold = 0.75;
            double decision = Math.random();
            if(decision>threshold) {
                walkingDirection = (int)((Math.random()*8));
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
                    walkingDirection = 1;
                }
                break;
            case 1:
                if((x+(humanWidth/2))<worldWidth) {
                    setLocation(x+2, y);
                }
                else {
                    setLocation(x-2, y);
                    walkingDirection = 0;
                }
                break;
            case 2:
                if((y-(humanHeight/2))>0) {
                    setLocation(x, y-2);
                }
                else {
                    setLocation(x, y+2);
                    walkingDirection = 3;
                }
                break;
            case 3:
                if((y+(humanHeight/2))<worldHeight) {
                    setLocation(x, y+2);
                }
                else {
                    setLocation(x, y-2);
                    walkingDirection = 2;
                }
                break;
            case 4:
                if((x-(humanWidth/2))>0 && (y-(humanHeight/2))>0) {
                    setLocation(x-2, y-2);
                }
                else {
                    setLocation(x+2, y-2);
                    walkingDirection = 1;
                }
                break;
            case 5:
                if((x+(humanWidth/2))<worldWidth && (y+(humanHeight/2))<worldHeight) {
                    setLocation(x+2, y+2);
                }
                else {
                    setLocation(x-2, y-2);
                    walkingDirection = 0;
                }
                break;
            case 6:
                if((x+(humanWidth/2))<worldWidth && (y-(humanHeight/2))>0) {
                    setLocation(x+2, y-2);
                }
                else {
                    setLocation(x-2, y+2);
                    walkingDirection = 1;
                }
                break;
            case 7:
                if((x+(humanWidth/2))<worldWidth && (y-(humanHeight/2))>0) {
                    setLocation(x-2, y+2);
                }
                else {
                    setLocation(x+2, y-2);
                    walkingDirection = 0;
                }
                break;
        }
    }
}
