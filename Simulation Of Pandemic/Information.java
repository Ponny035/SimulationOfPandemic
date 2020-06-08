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
    private Color color;
    
    public void act() 
    {
        printData();
    }
    
    public Information (String informationName, String data) {
        this(informationName,data,Color.WHITE);
    }
    
    public Information (String informationName, String data, Color color) {
        this.informationName = informationName;
        this.data = data;
        this.color =color;
    }
    
    private void printData() {
        setImage(new GreenfootImage("Human "+ informationName +" : "+ data, 24, color, new Color(0,0,0,130)));
    }
    
    public void updateData(String data) {
        this.data = data;
        printData();
    }
}
