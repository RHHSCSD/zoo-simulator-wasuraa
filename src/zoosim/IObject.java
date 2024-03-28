/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * An interface to visually represent to state of an Object
 * @author William Wen
 */
public interface IObject {

    /**
     * Turns the IObject a number of degrees clockwise
     * @param degrees the number of degrees to turn 
     */
    public void turn(double degrees);

    /**
     * Places the IObject onto specified coordinates 
     * @param x the x coordinate to place
     * @param y the y coordinate to place
     */
    public void place(int x, int y);
}
