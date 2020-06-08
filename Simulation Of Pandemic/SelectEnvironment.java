import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select_Environment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectEnvironment extends World
{
    int recoverPeriod = 50; 
    double immune = 0.7;
    int speed = 2;
    int people = 500;
    /**
     * Constructor for objects of class Select_Environment.
     * 
     */
    public SelectEnvironment()
    {    
        super(1280, 720, 1); 
        addObject(new BackSelect(),210,660);
        addObject(new StartSimulation(), 1100,660);
        addObject(new HowTo(), 1200, 70);
        addObject(new DoSocialDistancing(),444,497);
        addObject(new DoNotSocialDistancing(),867,497);
        addObject(new PopolationUp(),582,240);
        addObject(new PopolationDown(),580,265);
        addObject(new ImmuneUp(),1100,240);
        addObject(new ImmuneDown(),1100,265);
        addObject(new Popolation(),380,256);
        addObject(new Immune(),900,256);
        Greenfoot.start();
    }
    
    public void setImmune(double immune) {
        this.immune = immune;
    }
    
    public double getImmune() {
        return immune;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setPeople(int people) {
        this.people = people;
    }
    
    public int getPeople() {
        return people;
    }
    
    public boolean SocialDistancing(int speed) {
        if(this.speed==speed) {
            return true;
        }
        else {
            return false;
        }
    }
    
}
