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
public class Zoo {
    /*
    Thinking Question:
    
    */
    
    private ArrayList<Animal> animals;
    
    public Zoo() {
        animals = new ArrayList();
    }
    
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    
    public void displayStats() {
        double avgAge = 0;
        double avgSize = 0;
        double avgSpeed = 0;
        System.out.println("Number of total animals: " + animals.size());
        for(Animal animal: animals) {
            avgAge += (double)animal.getAge();
            avgSize += animal.getSize();
            avgSpeed += animal.getSpeed();
        }
        avgAge = Math.round(avgAge / animals.size() * 100.0) / 100.0;
        avgSize = Math.round(avgSize / animals.size() * 100.0) / 100.0;
        avgSpeed = Math.round(avgSpeed / animals.size() * 100.0) / 100.0;
        System.out.println("Average age: " + avgAge);
        System.out.println("Average size: " + avgSize);
        System.out.println("Average speed: " + avgSpeed);
    }
    
    public void feedAll() {
        for(Animal animal: animals) {
            animal.eat();
        }
    }
    
    public void sleepAll() {
        for(Animal animal: animals) {
            animal.sleep();
        }
    }
    
    public void moveAll() {
        for(Animal animal: animals) {
            animal.move();
        }
    }
}
