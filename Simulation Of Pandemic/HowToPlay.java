import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HowToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{

    /**
     * Constructor for objects of class HowToPlay.
     * 
     */
    public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        addObject( new BackToSelectEnvironment(), 70, 70);
        Greenfoot.start();
    }
}
