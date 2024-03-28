/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * An interface to represent any Object that can fly
 * @author William Wen
 */
public interface IFlyable {

    /**
     * Causes the Object to fly
     */
    public void fly();

    /**
     * Causes the Object to land
     */
    public void land();

    /**
     * Returns whether or not the Object is flying
     * @return true of the Object is flying, otherwise false
     */
    public boolean isFlying();
}
