/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author William
 */
public class ZooObject implements IObject {
    private String type;
    private double x;
    private double y;
    private double size;
    
    public void turn(double degrees) {
        /*public void turn(double degrees) {
        direction += degrees;
        if (direction >= 360) {
            direction -= 360;
        }*/
    }
    
    public void place(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
