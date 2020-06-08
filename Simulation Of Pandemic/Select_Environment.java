import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Select_Environment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Select_Environment extends World
{

    /**
     * Constructor for objects of class Select_Environment.
     * 
     */
    public Select_Environment()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject(new Back_Select(),210,660);
        addObject(new Start_Simulation(), 1100,660);
        addObject(new Notice(), 1200, 70);
        addObject(new Do_Noclick_SD(),444,497);
        addObject(new No_Noclick_SD(),867,497);
        addObject(new down1(),580,265);
        addObject(new down2(),1100,265);
        addObject(new up1(),582,240);
        addObject(new up2(),1100,240);
        Greenfoot.start();
    }
}
