/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * A class for any non-living Zoo object
 * @author William Wen
 */
public class ZooObject implements IObject {
    private String type;
    private double x;
    private double y;
    private double size;
    
    /**
     * Creates an instance of the ZooObject class
     */
    public ZooObject() {
        this.type = "rock";
        this.x = 0;
        this.y = 0;
        this.size = 1.0;
    }

    /**
     * Creates an instance of the ZooObject class
     * @param type the type of object
     * @param x the horizontal position of the ZooObject
     * @param y the vertical position of the ZooObject
     * @param size the size of the ZooObject
     */
    public ZooObject(String type, double x, double y, double size) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.size = size;
    }
    
    /**
     * Turns the ZooObject a number of degrees clockwise
     * @param degrees the number of degrees to turn 
     */
    public void turn(double degrees) {
        
    }
    
    /**
     * Places the ZooObject onto specified coordinates 
     * @param x the x coordinate to place
     * @param y the y coordinate to place
     */
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
