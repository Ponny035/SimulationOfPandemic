import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EndScreen extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public EndScreen(int cases)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        addObject( new Replay(), 45, 130);
        addObject( new Home(), 45, 60);
        addObject( new SummaryData(cases,new Color(238, 24, 24)), 640, 380);
        Greenfoot.start();
    }
}
