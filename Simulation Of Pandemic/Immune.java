import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Immune here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Immune extends Display
{
    double num;
    public Immune () {
        
    }
    /**
     * Act - do whatever the ShowPlayer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setNum();
        print();
    }    
    private void setNum () {
        num =((SelectEnvironment)getWorld()).getImmune();
    }
    private void print() {
        if(num==0.4) {
            setImage("images/Display/number_immunity_4.png");
        }
        else if(num==0.5) {
            setImage("images/Display/number_immunity_5.png");
        }
        else if(num==0.6) {
            setImage("images/Display/number_immunity_6.png");
        }
        else if(num==0.7) {
            setImage("images/Display/number_immunity_7.png");
        }
        else if(num==0.8) {
            setImage("images/Display/number_immunity_8.png");
        }
        else {
            setImage("images/Display/number_immunity_9.png");
        }
    }    
}
