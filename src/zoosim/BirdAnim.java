/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author William
 */
public class BirdAnim extends Animal implements IFlyable{
    private boolean canFly;
    private boolean flying = false;
    
    public BirdAnim() {
        super();
    }
    public BirdAnim(String name, String species, int id, char sex, double x, double y, String sound, boolean canFly) {
        super(name, species, id, sex, x, y, sound);
        this.canFly = canFly;
    }
    public BirdAnim(String name, String species, int id, char sex, int age, double x, double y, double size, double speed, String sound, boolean canFly) {
        super(name, species, id, sex, age, x, y, size, speed, sound);
        this.canFly = canFly;
    }
    
    public void fly() {
        if(canFly) {
            if(flying) {
            System.out.println(super.getName() + " flaps their wings and starts flying.");
        }
        else {
            System.out.println(super.getName() + " is already flying!");
        }
        flying = true;
        }
        else {
            System.out.println(super.getName() + " is unable to fly!");
        }
    }
    
    public void land() {
        if(canFly) {
            if(flying) {
            System.out.println(super.getName() + " lands back onto the ground.");
        }
        else {
            System.out.println(super.getName() + " is already grounded!");
        }
        flying = false;
        }
        else {
            System.out.println(super.getName() + " is unable to fly!");
        }
    }
    
    public boolean isFlying() {
        return flying;
    }
}
