/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.*;
/**
 *
 * @author William
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
        x = x + Math.cos(Math.toRadians(direction)) * speed;
        y = y + Math.sin(Math.toRadians(direction)) * speed; 
        
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
    
    public void turn(double degrees) {
        direction += degrees;
        if (direction >= 360) {
            direction -= 360;
        }
    }

    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    
}
