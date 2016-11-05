/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

/**
 *
 * @author p0074487
 */
public class Coordinates {
    private int x;
    private int y;
    
    public Coordinates (int x, int y) {
        this.x=x;
        this.y=y;
    }
    
   

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public void translate (int a, int b) {
        x+=a;
        y+=b;

    }

    public void scale(int factor, boolean s) {
        if (s) {
            x*=factor;
            y*=factor;
        }
        else {
            x/=factor;
            y/=factor;
        }
    }

    public String toString() {
        return " " + x + " " +y + " ";
    }

    public double distance (Coordinates p) {
        return Math.sqrt(Math.pow(x-p.getX(),2) + Math.pow(y-p.getY(), 2));
    }
    
   
    
}
