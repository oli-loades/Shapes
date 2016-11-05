/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.awt.Color;

/**
 *
 * @author p0074487
 */
public class ShapeManagement {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void menu() {
        System.out.println("Please enter an option");
        System.out.println("1: add a shape");
        System.out.println("2: remove a shape by position");
        System.out.println("3: get information about a shape by position");
        System.out.println("4: area and perimeter of a shape by position");
        System.out.println("5: Display information of all the shapes");
        System.out.println("6: transalate all the shapes");
        System.out.println("7: scale all the sahpes");
        System.out.println("8: save to file");
        System.out.println("0: quit program");
    }
    
// Model solution for add Shape, some shapes are missing
    public static void addShape(ShapeList shapes) {
        Scanner input = new Scanner (System.in);
        int x,y;
        System.out.println("ENter the name of the shape:");
        String s = input.next();
        switch (s) {
            case "circle" :
                System.out.println("ENter the coordinate of the centre");
                x = input.nextInt();
                y = input.nextInt() ;
                System.out.println("ENter the radius");
                int r = input.nextInt();
                shapes.addShape(new Circle(new Coordinates(x,y),r));
                break;
            case "rectangle" :
                System.out.println("ENter the coordinate of the top corner");
                 x = input.nextInt();
                 y = input.nextInt() ;
                System.out.println("ENter the width and height");
                int w = input.nextInt();
                int h = input.nextInt();
                shapes.addShape(new Rectangle(new Coordinates(x,y),w,h));
                break;
            case "triangle":
                Coordinates[] vertices = new Coordinates[3];
                for (int i = 0; i < 3; i++) {
                 System.out.println("ENter the coordinate of vertex"+ i+1);
                 x = input.nextInt();
                 y = input.nextInt() ;
                 vertices [i] = new Coordinates(x,y);
                }
            
                shapes.addShape(new Triangle(vertices));
                break;
            default:
                System.out.println("Shape unknown");
                
        }
    }

// Model solution for main method
    public static void main(String[] args) throws FileNotFoundException {
        ShapeList myShapes = new ShapeList();
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Load shapes from text file here");
        int option =1;
        while (option !=0) {
            menu();
            option = kb.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Option to add a rectangle, circle or triangle");
                    addShape(myShapes);
                    
                    break;
                case 2:
                    System.out.println("Remove a shape by position");
                    System.out.println("Enter the position between 0 and" + myShapes.numberShapes());
                    myShapes.remove(kb.nextInt());
                    
                    break;
                case 3:
                    System.out.println("3: get information about a shape by position");
                     System.out.println("Enter the position between 0 and" + myShapes.numberShapes());
                     System.out.println(myShapes.getShape(kb.nextInt()).toString());
                    break;
                case 4:
                    System.out.println("4: area and perimeter of a shape by position");
                    System.out.println("Enter the position between 0 and" + myShapes.numberShapes());
                    int pos = kb.nextInt();
                    System.out.println("Area is" + myShapes.area(pos) + "Perimeter" + myShapes.perimeter(pos));
                 case 5:
                    System.out.println("5:Display information");    
                    System.out.println(myShapes.toString());
                    break;
                  case 6:
                    System.out.println("translate all the shapes");
                    
                    myShapes.translate(2, 2);
                    
                      break;
                      
                      
                case 7:
                    System.out.println("scale all the shapes");
                    
                    myShapes.scale(2, true);
                    
                    break;
                 case 8:
                    System.out.println("save to file");
                     break;
                 case 0:
                     System.out.println("Goddbye");
                     break;
                default:
                    System.out.println("wrong option");
            }
                    
                  
        }
        
    }
}
