import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class plane extends Actor
{
    public plane()
    {
        getImage().scale(75, 75);
        setRotation(-90);
    }
    /**
     * Act - do whatever the plane wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(10);
        if(isAtEdge())
        {
            setRotation(getRotation() - 135);
            turn(14);
        }
    }
}
