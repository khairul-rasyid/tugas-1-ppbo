import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends Actor
{
    public car()
    {
        getImage().scale(65, 30);
        setRotation(90);
    }
    /**
     * Act - do whatever the car wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        if (Greenfoot.getRandomNumber(1000) > 970)
        {
            turn(getRotation() - 100);
        }
        if (isAtEdge())
        {
            turn(180);
        }
    }
}
