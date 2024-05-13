import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        fall();
        enemyDamage();
        outOfLimits();
    }
    
    private void fall() {
        this.setLocation(getX(), getY() - 6); 
    }
    
    private void outOfLimits(){
        if(this != null) {
            if(this.getY() >= 900 || this.getY() <= 0) {
                getWorld().removeObject(this); 
            }
        }
    }
    
    private void enemyDamage(){
        if(this != null) {
            if(this.isTouching(Enemy.class)) {
                // Player.increaseScore(); 
                // getWorld().removeObject(this);
            }
        }
    }
}
