/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shapes;
import java.awt.Color;
/**
 *
 * @author p0074487
 */
public class Shape {
    private int sides;
    private Color color;
    private Coordinates coordinates;
    
    public Shape (int sides, Coordinates p) {
        this.sides=sides;
        color = Color.BLACK;
        coordinates = p;
    }
    
    public int getSides() {
        return sides;
    }
    
    public Color getColor() {
        return color;
    }
    
    public void setColor(Color c) {
        color = c;
    }
    
    public double area() {
        return 0.0;
    }
    public double perimeter() {
        return 0.0;
    }
    public void translate(int dx, int dy){
        coordinates.translate(dx, dy);
    }
    
    public void scale(int factor, boolean sign) {
        
    } 
    public Coordinates getCoordinates() {return coordinates;}

    public String toString() {
        return "Shape " + "Coordinates " + coordinates.toString();
    }
    
}
