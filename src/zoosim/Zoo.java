/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;
import java.util.*;
/**
 * The class Zoo contains a list of Animals and methods for managing and analyzing the Animals
 * @author William Wen
 */
public class Zoo {
    /*
    Thinking Question:
    To implement predator/prey interactions and Carnivores/Herbivores/Omnivores, 
    I would create three interfaces, one for Carnivores, Herbivores and Omnivores. 
    Omnivores could simply extend both Carnivores and Herbivores, since it can eat both plants and animals
    Carnivores would require a method eatAnimal(); 
    Herbivores would require a method eatPlant();
    I would then modify the structure of the Zoo, and create classes to represent each specific Animal type/species.
    Each Animal would extend either LandAnim, WaterAnim or BirdAnim
    This way, each Animal could either implement Carnivores, Herbivores, or Omnivores
    To include predator/prey interactions, the predators would be coded in with the implementations of Carnivores or Omnivores (Herbivores don't eat Animals). The methods could be overloaded to include multiple different possible prey.
    The preys would likely have to have their work done in the Zoo class itself, as if an animal was eaten, it should be deleted from the Animal ArrayList. However, using try and catch statements could detect whether a predator could eat a prey, if that predator had a method to eatAnimal() that included parameters for the prey it attempted to eat.
    The caviat is that each Animal would now require a class, but this way they could include both the implementation of LandAnim, WaterAnim or BirdAnim AND Carnivores, Herbivores, or Omnivores.
    It also allows for more specific interactions between Animals that can check if such interactions can exist (e.g. not every predator can eat every prey)
    */
    
    private ArrayList<Animal> animals;
    
    /**
     * Creates an instance a Zoo with an unfilled list of Animals
     */
    public Zoo() {
        animals = new ArrayList();
    }
    
    /**
     * Adds an Animal to the Zoo's list of Animals
     * @param animal the Animal to be added
     */
    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    
    /** 
     * Displays general statistics regarding the Animals in the Zoo
     */
    public void displayStats() {
        double avgAge = 0;
        double avgSize = 0;
        double avgSpeed = 0;
        // Prints the total number of animals
        System.out.println("Number of total animals: " + animals.size());
        for(Animal animal: animals) {
            // Sums the age, size and speed of every animal
            avgAge += (double)animal.getAge();
            avgSize += animal.getSize();
            avgSpeed += animal.getSpeed();
            
            // Prints information from each animal
            System.out.println(animal);
        }
        
        // Gets and prints averages for age, speed and size
        avgAge = Math.round(avgAge / animals.size() * 100.0) / 100.0;
        avgSize = Math.round(avgSize / animals.size() * 100.0) / 100.0;
        avgSpeed = Math.round(avgSpeed / animals.size() * 100.0) / 100.0;
        System.out.println("Average age: " + avgAge);
        System.out.println("Average size: " + avgSize);
        System.out.println("Average speed: " + avgSpeed);
    }
    
    /**
     * Feeds all Animals in the Zoo
     */
    public void feedAll() {
        for(Animal animal: animals) {
            animal.eat();
        }
    }
    
    /**
     * Causes all Animals in the Zoo to sleep
     */
    public void sleepAll() {
        for(Animal animal: animals) {
            animal.sleep();
        }
    }
    
    /**
     * Moves all Animals in the Zoo
     */
    public void moveAll() {
        for(Animal animal: animals) {
            animal.move();
        }
    }
}
