import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 1.0
 */
public class SpeedInformation extends Information
{
    /**
     * Act - do whatever the SpeedInformation wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SpeedInformation () {
        super("Speed", ""+SimulationWorld.speed);
    }
}
