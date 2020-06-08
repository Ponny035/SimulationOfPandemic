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
    private static int healthy = 0;
    private static int infected = 1;
    private static int recover = 0;
    
    public SimulationWorld() {
        this(1280,720, 50,0.75,3,500);
    }
    
    public SimulationWorld(int width, int height, int recoverPeriod, double immune, int speed,int people)
    {
        super(width, height, 1);
        this.recoverPeriod = recoverPeriod;
        this.immune = immune;
        this.speed = speed;
        this.healthy = people-1;
        int y = (int)(Math.random()*700+10);
        int x = (int)(Math.random()*1200+10);
        for(int i=0;i<(people-1);i++) {
            addObject( new Human(this.getWidth(),this.getHeight(),recoverPeriod, immune,speed), x, y);
            y = (int)(Math.random()*700+10);
            x = (int)(Math.random()*1250+10);
        }
        addObject( new Human(this.getWidth(),this.getHeight(),1,recoverPeriod, immune,speed), x, y);
        addObject( new HealthyPeople(), 1110, 50);
        addObject( new InfectedPeople(), 1110, 75);
        addObject( new RecoverPeople(), 1110, 100);
        addObject( new ImmunityInformation(), 1110, 650);
        addObject( new MovemntInformation(), 1050, 675);
        Greenfoot.start();
    }
    
    public void setImmune (double immune) {
        this.immune = immune;
    }
    
    public double getImmune () {
        return immune;
    }
    
    public void setHealthy (int healthy) {
        this.healthy = healthy;
    }
    
    public static int getHealthy () {
        return healthy;
    }
    
    public void setInfected (int infected) {
        this.infected = infected;
    }
    
    public static int getInfected () {
        return infected;
    }
    
    public void setRecover (int recover) {
        this.recover = recover;
    }
    
    public static int getRecover () {
        return recover;
    }
    
    public static String getMovement () {
        if(speed==2) {
            return "Do Social Distancing";
        }
        else {
            return "Don't Social Distancing";
        }
    }
}
