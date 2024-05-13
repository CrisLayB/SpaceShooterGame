import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int moveSpeed = 6; 
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
        movement();
        shoot();
    }
    
    private void movement(){
        if(Greenfoot.isKeyDown("Left") || Greenfoot.isKeyDown("a")) {
            this.setLocation(getX() - moveSpeed, getY()); 
        }
        
        if(Greenfoot.isKeyDown("Right") || Greenfoot.isKeyDown("d")) {
            this.setLocation(getX() + moveSpeed, getY()); 
        }
        
        if(Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("w")) {
            this.setLocation(getX(), getY() - moveSpeed); 
        }
        
        if(Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("s")) {
            this.setLocation(getX(), getY() + moveSpeed); 
        }
    }
    
    private void shoot(){
        if(Greenfoot.isKeyDown("Space")) {
            Space world = (Space)getWorld();
            Laser laser = new Laser();
            world.addObject(laser, getX(), getY());
        }
    }
}
