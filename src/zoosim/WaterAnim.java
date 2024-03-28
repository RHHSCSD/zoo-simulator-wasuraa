/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * A class to represent any water-based animal
 * @author William Wen
 */
public class WaterAnim extends Animal implements ISwimmable{
    private boolean canBreathe; // defines the WaterAnim's ability to breathe air
    
    /**
     * Creates an instance of the WaterAnim class
     */
    public WaterAnim() {
        super();
        canBreathe = false;
    }

    /**
     * Creates an instance of the WaterAnim class
     * @param name the Animal's name
     * @param species the name of the Animal's species
     * @param id the id number for the Animal
     * @param sex the Animal's sex
     * @param x the horizontal position of the Animal
     * @param y the vertical position of the Animal
     * @param sound the sound the Animal makes
     * @param canBreathe whether or not the Animal can breathe air
     */
    public WaterAnim(String name, String species, int id, char sex, double x, double y, String sound, boolean canBreathe) {
        super(name, species, id, sex, x, y, sound);
        this.canBreathe = canBreathe;
    }

    /**
     * Creates an instance of the WaterAnim class
     * @param name the Animal's name
     * @param species the name of the Animal's species
     * @param id the id number for the Animal
     * @param sex the Animal's sex
     * @param age the Animal's age
     * @param x the horizontal position of the Animal
     * @param y the vertical position of the Animal
     * @param size the size of the Animal
     * @param speed the speed of the Animal
     * @param sound the sound the Animal makes
     * @param canBreathe whether or not the Animal can breathe air
     */
    public WaterAnim(String name, String species, int id, char sex, int age, double x, double y, double size, double speed, String sound, boolean canBreathe) {
        super(name, species, id, sex, age, x, y, size, speed, sound);
        this.canBreathe = canBreathe;
    }
    
    public boolean canSurface() {
        return canBreathe;
    }
}
