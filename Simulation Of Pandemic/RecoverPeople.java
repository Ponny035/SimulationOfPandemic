import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RecoverPeople here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecoverPeople extends Information
{
    public RecoverPeople () {
        super("Recover People", "", new Color(102,255,178));
        
    }
    
    public void act() 
    {
        checkRecover();
        updateData(((SimulationWorld)getWorld()).getRecover()+"");
    }
    
    private void checkRecover() {
        List<Human>objects = getObjectsInRange(1500, Human.class);
        int count = 0;
        double value = 0;
        for (Human h : objects) 
        { 
            if (h.getInfectionStage()==2) {   
                count++;
            }
        }
        ((SimulationWorld)getWorld()).setRecover(count);
    }    
}
