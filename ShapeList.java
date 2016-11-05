/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author p0074487
 */
public class ShapeList {

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void addShape(Shape s) {
        shapes.add(s);
    }

    public Shape remove(int pos) {
        if (pos > shapes.size()) {
            return null;

        } else {
            return (shapes.remove(pos));

        }
    }

    public double area(int pos) {
        return shapes.get(pos).area();
    }

    public double perimeter(int pos) {
        return shapes.get(pos).perimeter();
    }

    public void translate(int x, int y) {
        for (Shape s : shapes) {
            s.translate(x, y);
        }
    }

    public void scale(int factor, boolean sign) {
        for (Shape s : shapes) {
            s.scale(factor, sign);
        }
    }

    // new method to return the number of shapes
    public int numberShapes() {
        return shapes.size();
    }

    // new method to return a shape given the postion
    public Shape getShape(int pos) {
        return shapes.get(pos);
    }

    public String toString() {
        String st = "";
        for (Shape s : shapes) {
            st += s.toString() + "\n";
            // st+= s.toString() + " area " +s.area() + " peritmeter " + s.perimeter() + "\n";

        }
        return st;
    }

    public void load() throws FileNotFoundException {
        FileInputStream fileInput = new FileInputStream("outfile.txt");
        Scanner fScan = new Scanner(fileInput);
        Shape sh;
        int x;
        int y;
        int r = 0;
        int g = 0;
        int b = 0;
        while (fScan.hasNext()) {
            String name = fScan.next();
            switch (name) {
                case "Square":
                    x = fScan.nextInt();
                    y = fScan.nextInt();
                    int s = fScan.nextInt();
                    sh = new Square(new Coordinates(x, y), s);
                    while (fScan.hasNextInt()) {
                        r = fScan.nextInt();
                        System.out.println(r);
                    }

                    while (fScan.hasNextInt()) {
                        g = fScan.nextInt();
                        System.out.println(g);
                    }
                    while (fScan.hasNextInt()) {
                        b = fScan.nextInt();
                        System.out.println(b);
                    }
                    sh.setColor(new Color(r, g, b));
                    shapes.add(sh);
                    break;

                case "Rectangle":
                    x = fScan.nextInt();
                    y = fScan.nextInt();
                    int w = fScan.nextInt();
                    int l = fScan.nextInt();
                    sh = new Rectangle(new Coordinates(x, y), w, l);
                    r = fScan.nextInt();
                    g = fScan.nextInt();
                    b = fScan.nextInt();
                    sh.setColor(new Color(r, g, b));
                    shapes.add(sh);
                    break;

                case "Ellipse":
                    x = fScan.nextInt();
                    y = fScan.nextInt();
                    int rx = fScan.nextInt();
                    int ry = fScan.nextInt();
                    sh = new Ellipse(new Coordinates(x, y), rx, ry);
                    r = fScan.nextInt();
                    g = fScan.nextInt();
                    b = fScan.nextInt();
                    sh.setColor(new Color(r, g, b));
                    shapes.add(sh);
                    break;

                case "Circle":
                    x = fScan.nextInt();
                    y = fScan.nextInt();
                    int rad = fScan.nextInt();
                    sh = new Circle(new Coordinates(x, y), rad);
                    r = fScan.nextInt();
                    g = fScan.nextInt();
                    b = fScan.nextInt();
                    sh.setColor(new Color(r, g, b));
                    shapes.add(sh);
                    break;

                case "Triangle":
                    Coordinates[] vertices = new Coordinates[3];
                    for (int i = 0; i < 3; i++) {
                        x = fScan.nextInt();
                        y = fScan.nextInt();
                        vertices[i] = new Coordinates(x, y);
                    }
                    sh = new Triangle(vertices);
                    r = fScan.nextInt();
                    g = fScan.nextInt();
                    b = fScan.nextInt();
                    sh.setColor(new Color(r, g, b));
                    shapes.add(sh);
                    break;

            }
        }
    }

    public void save() throws FileNotFoundException {
        PrintWriter fileOut = new PrintWriter("outfile.txt");
        String st;
        for (Shape s : shapes) {
            st = "";
            st = s.toString() + "\n";
            fileOut.println(st);
        }
        fileOut.close();

    }
}
