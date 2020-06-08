import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class COVID_STORY here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class COVID_STORY extends World
{

    /**
     * Constructor for objects of class COVID_STORY.
     * 
     */
    public COVID_STORY()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280,720,1); 
        addObject( new Back_Homescreen(), 70, 70);
        Greenfoot.start();
    }
}
