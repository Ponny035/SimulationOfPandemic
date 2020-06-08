import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Popolation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Popolation extends Display
{
    int num;
    public Popolation () {
        
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
        num =((SelectEnvironment)getWorld()).getPeople();
    }
    private void print() {
        switch (num) {
            case 100:
                setImage("images/Display/number_populartion_100.png");
                break;
            case 200:
                setImage("images/Display/number_populartion_200.png");
                break;
            case 300:
                setImage("images/Display/number_populartion_300.png");
                break;
            case 400:
                setImage("images/Display/number_populartion_400.png");
                break;
            case 500:
                setImage("images/Display/number_populartion_500.png");
                break;
                
        }
    }    
}
