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
public class Rectangle extends Shape {
  //  private Coordinate corner;
    private int width;
    private int length;

    public Rectangle(Coordinates p, int width, int length) {
        // Coordinate is the top left cornere
        super(4,p);
       // corner = p;
        this.width = width;
        this.length= length;
        
    }

    public int getWidth(){return width;}
    public int getLength() {return length;}
   // public Coordinate getPoint() {return corner;}
   
   
    public double area() {return width*length;}
    public double perimeter() {return 2*(width+length);}

    public void translate(int a, int b) {
        super.translate(a, b);
    }
    public void scale(int factor, boolean s) {
        //corner.scale(factor);
        if(s) {
            width*=factor;
            length *=factor;
        }
        else {
            width /= factor;
            length /= factor;
           
        }
    }
    
    public String toString () {
        
        Color c = getColor();;
        return "Rectangle" + getCoordinates().toString() + width + " " + length + " " +c.getRed() + " " + c.getGreen() + " " + c.getBlue();    }
}
