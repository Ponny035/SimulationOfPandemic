import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InfectedPeople here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InfectedPeople extends Information
{
    public InfectedPeople () {
        super("Infected People", "",Color.RED);
    }
    
    public void act() 
    {
        if(((SimulationWorld)getWorld()).getInfected()!=0){
            checkInfected();
            updateData(((SimulationWorld)getWorld()).getInfected()+"");
        }
        else {
            Greenfoot.setWorld(new EndScreen(((SimulationWorld)getWorld()).getTotalTnfected()));
            getWorld().removeObject(this);
        }
    }
    
    private void checkInfected() {
        List<Human>objects = getObjectsInRange(1500, Human.class);
        int count = 0;
        double value = 0;
        for (Human h : objects) 
        { 
            if (h.getInfectionStage()==1) {   
                count++;
            }
        }
        ((SimulationWorld)getWorld()).setInfected(count);
    }    
}
