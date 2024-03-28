/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * A class that represents any land-based animal
 * @author William Wen
 */
public class LandAnim extends Animal {

    /**
     * Creates an instance of the LandAnim class
     */
    public LandAnim() {
        super();
    }

    /**
     * Creates an instance of the LandAnim class
     * @param name the Animal's name
     * @param species the name of the Animal's species
     * @param id the id number for the Animal
     * @param sex the Animal's sex
     * @param x the horizontal position of the Animal
     * @param y the vertical position of the Animal
     * @param sound the sound the Animal makes
     */
    public LandAnim(String name, String species, int id, char sex, double x, double y, String sound) {
        super(name, species, id, sex, x, y, sound);
    }

    /**
     * Creates an instance of the LandAnim class
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
     */
    public LandAnim(String name, String species, int id, char sex, int age, double x, double y, double size, double speed, String sound) {
        super(name, species, id, sex, age, x, y, size, speed, sound);
    }
}
