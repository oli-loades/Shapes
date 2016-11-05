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
public class Ellipse extends Shape {

    private int rx;
    private int ry;

    public Ellipse(Coordinates centre, int rx, int ry) {
        super(0, centre);
        this.rx = rx;
        this.ry = ry;
    }

    public int getRadiusx() {
        return rx;
    }

    public int getRadiusy() {
        return ry;
    }

    public double area() {
        return 2 * Math.PI * Math.sqrt((rx * rx + ry * ry) / 2);
    }

    public double perimeter() {
        return Math.PI * rx * ry;
    }

    public void translate(int a, int b) {
        super.translate(a, b);
    }

    public void scale(int factor, boolean sign) {
        if (sign) {
            rx *= factor;
            ry *= factor;
        } else {
            rx /= factor;
            ry /= factor;
        }
    }

    public String toString() {
        Color c = getColor();
        System.out.println(c.getRed());
        return "Ellipse" + getCoordinates().toString() + rx + " " + ry + " " +c.getRed() + " " + c.getGreen() + " " + c.getBlue();
    }
}
