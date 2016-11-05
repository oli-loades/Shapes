/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author p0073862
 */
public class Circle extends Ellipse {

    public Circle(Coordinates centre, int radius) {
        super(centre, radius, radius);
    }

    public int getRadius() {
        return getRadiusx();
    }

    public double area() {
        return Math.PI * getRadiusx();
    }

    public String toString() {
        Color c = getColor();
        System.out.println(c.getRed());
        return "Circle" + getCoordinates().toString() + getRadiusx() + " " + c.getRed() + " " + c.getGreen() + " " + c.getBlue();
    }
}
