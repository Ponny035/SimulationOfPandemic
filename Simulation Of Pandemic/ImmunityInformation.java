import java.util.List;
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 1.0
 */
public class ImmunityInformation extends Information
{
    public ImmunityInformation () {
        super("Avg. Immunity", "",Color.CYAN);
    }
    
    public void act() 
    {
        checkImmune();
        updateData(((SimulationWorld)getWorld()).getImmune()+"");
    }
    
    private void checkImmune() {
        List<Human>objects = getObjectsInRange(1500, Human.class);
        int count = 0;
        double value = 0;
        for (Human h : objects) 
        { 
            value+=h.getImmune();
            count++;
        }
        double avg = Math.round(value/count*100)/100.0;
        ((SimulationWorld)getWorld()).setImmune(avg);
    }
}
