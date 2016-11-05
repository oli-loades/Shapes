/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author p0074487
 */
public class Square extends Rectangle {

    public Square(Coordinates p, int side) {
        super(p, side, side);
    }

    public String toString() {
        Color c = getColor();
        return "Square" + getCoordinates().toString() + getWidth() + " " + c.getRed() + " " + c.getGreen() + " " + c.getBlue();
    }
}
