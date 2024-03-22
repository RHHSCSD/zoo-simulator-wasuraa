/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author William
 */
public class LandAnim extends Animal {
    public LandAnim() {
        super();
    }
    public LandAnim(String name, String species, int id, char sex, double x, double y, String sound) {
        super(name, species, id, sex, x, y, sound);
    }
    public LandAnim(String name, String species, int id, char sex, int age, double x, double y, double size, double speed, String sound) {
        super(name, species, id, sex, age, x, y, size, speed, sound);
    }
}
