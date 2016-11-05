/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author arantza
 */
public class Triangle extends Shape {

    Coordinates[] vertices;

    public Triangle(Coordinates[] vertices) {
        super(3, vertices[0]);
        this.vertices = vertices;
    }

    public double area() {
        double s = perimeter();
        double area = s * (s - vertices[0].distance(vertices[1])) * (s - vertices[1].distance(vertices[2]))
                * (s - vertices[0].distance(vertices[2]));
        return area;
    }

    public void translate(int a, int b) {
        for (int i = 0; i < vertices.length; i++) {
            vertices[i].translate(a, b);
        }
    }

    public void scale(int factor, boolean sign) {
        for (int i = 0; i < vertices.length; i++) {
            vertices[i].scale(factor, sign);
        }
    }

    public Coordinates getVertex(int i) {
        return vertices[i];
    }

    public double perimeter() {
        double total = 0;
        for (int i = 0; i < vertices.length - 1; i++) {
            total += vertices[i].distance(vertices[i + 1]);
        }
        return total + vertices[0].distance(vertices[2]);
    }

    public String toString() {
        Color c = getColor();
        String s = "Triangle ";
        for (Coordinates v : vertices) {
            s += "" + v.toString();
        }
        return s + " " + c.getRed() + " " + c.getGreen() + " " + c.getBlue();
    }

}
