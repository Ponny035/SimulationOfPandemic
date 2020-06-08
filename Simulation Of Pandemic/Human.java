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
    private int speed;
    private int countWalk = 0;
    private int infectionStage;
    private int infectionPeriod;
    private int recoverPeriod;
    private double immune;
    private double recoveryThreshold = 1;
    private double walkingDirection = 0;
    
    public Human(int worldWidth, int worldHeight) {
        this("images/Skin/normal.png", 20, 20, worldWidth, worldHeight,0, 50, 0.75,2);
    }
    
    public Human(int worldWidth, int worldHeight, int recoverPeriod, double immune, int speed) {
        this("images/Skin/normal.png", 20, 20, worldWidth, worldHeight,0,recoverPeriod, immune,speed);
    }
    
    public Human(int worldWidth, int worldHeight, int infectionStage, int recoverPeriod, double immune, int speed) {
        this("images/Skin/normal.png", 20, 20, worldWidth, worldHeight,infectionStage, recoverPeriod, immune,speed);
    }

    public Human(String skin, int humanWidth, int humanHeight,int worldWidth, int worldHeight, int infectionStage, int recoverPeriod, double immune, int speed) {
        this.humanWidth = humanWidth;
        this.humanHeight = humanHeight;
        this.worldWidth = worldWidth;
        this.worldHeight = worldHeight;
        this.infectionStage = infectionStage;
        this.recoverPeriod = recoverPeriod;
        this.immune = immune;
        this.speed = speed;
        image = new GreenfootImage(skin);
        image.scale(humanWidth, humanHeight);
        setImage(image);
        if(infectionStage==1) {
            changeStage(0);
        }
    }
    
    public int getInfectionStage() {
        return infectionStage;
    }

    private void spread() {
        List<Human>objects = getObjectsInRange(30, Human.class);
        for (Human h : objects) 
        { 
            double p = Math.random();
            if (h.getInfectionStage()!=1 && p>h.getImmune()) {
                if(h.getInfectionStage()==2){
                    h.setRecoveryThreshold(1);
                    h.setRecoverPeriod(50);
                    h.setInfectionPeriod(0);
                }
                ((SimulationWorld)getWorld()).upadteTotalTnfected();
                h.changeStage(0);
            }
        }
    }
    
    public double getImmune () {
        return immune;
    }
    
    public void setRecoveryThreshold (double recoveryThreshold) {
        this.recoveryThreshold = recoveryThreshold;
    }
    
    public void setRecoverPeriod (int recoverPeriod) {
        this.recoverPeriod = recoverPeriod;
    }
    
    public void setInfectionPeriod (int infectionPeriod) {
        this.infectionPeriod = infectionPeriod;
    }
    
    public void gotInfection () {
        changeStage(infectionStage);
    }

    public void act()
    {
       travel();
       if (infectionStage == 1) {
           spread();
           checkRecovery();
       }
    }

    private void checkRecovery() {
        if(infectionPeriod > recoverPeriod) {
            double recover = Math.random();
            if(recover>recoveryThreshold) {
                changeStage(infectionStage);
                immune = immune*1.1;
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
                image = new GreenfootImage("images/Skin/infected.png");
                image.scale(humanWidth, humanHeight);
                setImage(image);
                break;
            case 1:
                infectionStage = 2;
                image = new GreenfootImage("images/Skin/recover.png");
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
        int xDiff = (int)(speed*Math.cos(direction));
        int yDiff = (int)(speed*Math.sin(direction));
        boolean checkBoundaries = false;
        if((x-(humanWidth/2))+xDiff<0 || (x+(humanWidth/2))+xDiff>worldWidth) {
            direction = direction+Math.PI;
            walkingDirection = walkingDirection + Math.PI;
        }
        if((y-(humanHeight/2))+yDiff<0 || (y+(humanHeight/2))+yDiff>worldHeight) {
            direction = direction+Math.PI;
            walkingDirection = walkingDirection + Math.PI;
        }
        setLocation(x+(int)(speed*Math.cos(direction)), y+(int)(speed*Math.sin(direction)));
    }
}
