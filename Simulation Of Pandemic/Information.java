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
        printData();
    }
    
    public Information (String informationName, String data) {
        this.informationName = informationName;
        this.data = data;
    }
    
    private void printData() {
        setImage(new GreenfootImage("Human "+ informationName +" : "+ data, 24, Color.WHITE, new Color(0,0,0,127)));
    }
    
    public void updateData(String data) {
        this.data = data;
        printData();
    }
}
