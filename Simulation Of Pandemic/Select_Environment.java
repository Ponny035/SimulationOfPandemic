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
        Greenfoot.start();
    }
}
