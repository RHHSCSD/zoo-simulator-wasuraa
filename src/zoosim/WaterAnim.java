/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author William
 */
public class WaterAnim extends Animal implements ISwimmable{
    private boolean canBreathe; // defines the WaterAnim's ability to breathe air
    
    public WaterAnim() {
        super();
        canBreathe = false;
    }
    public WaterAnim(String name, String species, int id, char sex, double x, double y, String sound, boolean canBreathe) {
        super(name, species, id, sex, x, y, sound);
        this.canBreathe = canBreathe;
    }
    public WaterAnim(String name, String species, int id, char sex, int age, double x, double y, double size, double speed, String sound, boolean canBreathe) {
        super(name, species, id, sex, age, x, y, size, speed, sound);
        this.canBreathe = canBreathe;
    }
    
    public boolean canSurface() {
        return canBreathe;
    }
}
