import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SummaryData here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SummaryData extends Information
{
    public SummaryData (int data, Color color) {
        super("",data+"",color);
        setImage(new GreenfootImage(data+"", 100, color, new Color(0,0,0,0)));
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
