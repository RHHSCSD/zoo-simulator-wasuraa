/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.*;
/**
 * A class representation of an Animal containing a set of information and that can perform various actions
 * @author William Wen
 */
public class Animal implements IEntity {
    private int id;
    private String name;
    private String species;
    private char sex;
    private int age;
    private double x;
    private double y;
    private double size;
    private double speed;
    private double direction;
    private int hunger;
    private int fatigue;
    private Image image;
    private String sound;
    
    /**
     * Creates an instance of an Animal
     */
    public Animal() {
        this.id = 0;
        this.name = "";
        this.species = "";
        this.sex = ' ';
        this.age = 0;
        this.x = 0;
        this.y = 0;
        this.size = 1;
        this.speed = 1;
        this.direction = 0;
        this.hunger = 0;
        this.fatigue = 0;
        this.image = null;
        this.sound = "";
    }
    
    /**
     * Creates an instance of an Animal
     * @param name the Animal's name
     * @param species the name of the Animal's species
     * @param id the id number for the Animal
     * @param sex the Animal's sex
     * @param x the horizontal position of the Animal
     * @param y the vertical position of the Animal
     * @param sound the sound the Animal makes
     */
    public Animal(String name, String species, int id, char sex, double x, double y, String sound) {
        this.name = name;
        this.species = species;
        this.id = id;
        this.sex = sex;
        this.x = x;
        this.y = y;
        this.sound = sound;
        
        this.size = 1;
        this.speed = 1;
        this.direction = 0;
        this.hunger = 0;
        this.fatigue = 0;
        this.image = null;
        this.sound = "";
    }
    
    /**
     * Creates an instance of an Animal
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
    public Animal(String name, String species, int id, char sex, int age, double x, double y, double size, double speed, String sound) {
        this.name = name;
        this.species = species;
        this.id = id;
        this.sex = sex;
        this.x = x;
        this.y = y;
        this.age = age;
        this.size = size;
        this.speed = speed;
        this.sound = sound;
        
        this.direction = 0;
        this.hunger = 0;
        this.fatigue = 0;
        this.image = null;
    } 
    
    public void makeSound() {
        System.out.println(getName() + ": " + sound);
    }
    
    public void move() {
        x = x + Math.cos(Math.toRadians(direction)) * getSpeed();
        y = y + Math.sin(Math.toRadians(direction)) * getSpeed(); 
        
        System.out.println(getName() + " moves to " + x + ", " + y + ".");
    }
    
    public void eat() {
        hunger = 0;
        System.out.println(getName() + " ate a nice meal and is now completely filled up!");
    }
    
    public void sleep() {
        fatigue = 0;
        System.out.println(getName() + " had a long and comfortable sleep and is now completely well rested!");
    }
    
    /**
     * Turns the Animal clockwise
     * @param degrees the number of degrees to turn
     */
    public void turn(double degrees) {
        direction += degrees;
        if (direction >= 360) {
            direction -= 360;
        }
        else if (direction <= 0) {
            direction += 360;
        }
    }

    /**
     * Places the Animal onto a pair of coordinates
     * @param x the horizontal coordinate
     * @param y the vertical coordinate
     */
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Gets the name of the Animal
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the age of the Animal
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Gets the size of the Animal
     * @return the size
     */
    public double getSize() {
        return size;
    }

    /**
     * Gets the speed of the Animal
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * Gets the Animal's ID
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the Animal's ID
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the name of the Animal
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the age of the Animal
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Sets the size of the Animal
     * @param size the size to set
     */
    public void setSize(double size) {
        this.size = size;
    }

    /**
     * Sets the speed of the Animal
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * Gets the hunger level of the Animal
     * @return the hunger
     */
    public int getHunger() {
        return hunger;
    }

    /**
     * Gets the fatigue level of the Animal
     * @return the fatigue
     */
    public int getFatigue() {
        return fatigue;
    }

    /**
     * Sets the Image of the Animal
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }
    
    /**
     * Returns a String representation of the Animal's general info
     * @return the name, species, sex, age, size, speed, hunger and fatigue of the Animal in a formatted list
     */
    @Override
    public String toString() {
        return "Name: " + this.name + "\nSpecies: " + this.species + "\nSex: " + this.sex + "\nAge: " + this.age + "\nSize: " + this.size + "\nSpeed: " + this.speed + "\nHunger: " + this.hunger + "\nFatigue: " + this.fatigue;
    }
}
