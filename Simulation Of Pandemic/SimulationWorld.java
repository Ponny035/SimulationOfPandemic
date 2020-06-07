import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 0.1.0
 */
public class SimulationWorld extends World
{    
    public static int recoverPeriod = 0;
    public static double immune = 0;
    public static int speed = 0;
    
    public SimulationWorld() {
        this(1280,720, 50,0.75,2);
    }
    
    public SimulationWorld(int width, int height, int recoverPeriod, double immune, int speed)
    {
        super(width, height, 1);
        this.recoverPeriod = recoverPeriod;
        this.immune = immune;
        this.speed = speed;
        int y = (int)(Math.random()*700+10);
        int x = (int)(Math.random()*1200+10);
        for(int i=0;i<499;i++) {
            addObject( new Human(this.getWidth(),this.getHeight(),recoverPeriod, immune,speed), x, y);
            y = (int)(Math.random()*700+10);
            x = (int)(Math.random()*1250+10);
        }
        addObject( new Human(this.getWidth(),this.getHeight(),1,recoverPeriod, immune,speed), x, y);
        addObject( new ImmunityInformation(), 1110, 25);
        addObject( new SpeedInformation(), 1140, 45);
        addObject( new RecoverPeriodInformation(), 1140, 65);
        Greenfoot.start();
    }
    
    public void setImmune (double immune) {
        this.immune = immune;
    }
    
    public double getImmune () {
        return immune;
    }
}
