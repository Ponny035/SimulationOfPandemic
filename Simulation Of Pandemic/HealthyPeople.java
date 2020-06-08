import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HealthyPeople here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthyPeople extends Information
{
    public HealthyPeople () {
        super("Healthy People", "");
    }
    
    public void act() 
    {
        if(((SimulationWorld)getWorld()).getHealthy()!=0){
            checkHealthy();
            updateData(((SimulationWorld)getWorld()).getHealthy()+"");
        }
    }
    
    private void checkHealthy() {
        List<Human>objects = getObjectsInRange(1500, Human.class);
        int count = 0;
        double value = 0;
        for (Human h : objects) 
        { 
            if (h.getInfectionStage()==0) {   
                count++;
            }
        }
        ((SimulationWorld)getWorld()).setHealthy(count);
    }    
}
