/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * An interface to represent anything that can swim in the water
 * @author William Wen
 */
public interface ISwimmable {

    /**
     * Returns whether or not the Object can surface
     * @return true if the Object can surface, otherwise false
     */
    public boolean canSurface();
}
