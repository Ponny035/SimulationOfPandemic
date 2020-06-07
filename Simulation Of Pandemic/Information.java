import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 *
 * @author Patipol Saechan, Kritchagamol Sannarong
 * @version 1.0
 */
public class Information extends Actor
{
    private String informationName;
    private String data;
    public void act() 
    {
        printHigh();
    }
    
    public Information (String informationName, String data) {
        this.informationName = informationName;
        this.data = data;
    }
    
    private void printHigh() {
        setImage(new GreenfootImage("Human "+ informationName +" : "+ data, 24, Color.WHITE, new Color(0,0,0,0)));
    }    
}
