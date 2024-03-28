/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The interface IEntity represents an kind of entity
 * @author William Wen
 */
public interface IEntity extends IObject{

    /**
     * Moves the entity
     */
    public void move();

    /**
     * Makes a sound
     */
    public void makeSound();

    /**
     * Makes the entity eat
     */
    public void eat();

    /**
     * Makes the entity sleep
     */
    public void sleep();
}
