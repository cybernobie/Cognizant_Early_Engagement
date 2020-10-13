import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Shape[] shapes = new Shape[5];

       for (int i = 0; i < 5; ++i) {
           String shapeName = scanner.next();
           Shape shape = null;

           switch (shapeName) {
               case "Triangle": {
                   double base = scanner.nextDouble();
                   double height = scanner.nextDouble();

                   shape = new Triangle();
                   ((Triangle) shape).setBase(base);
                   ((Triangle) shape).setHeight(height);
                   break;
               }
               case "Rectangle": {
                   double length = scanner.nextDouble();
                   double width = scanner.nextDouble();

                   shape = new Rectangle();
                   ((Rectangle) shape).setLength(length);
                   ((Rectangle) shape).setWidth(width);
                   break;
               }
               case "Cube": {
                   double length = scanner.nextDouble();
                   double width = scanner.nextDouble();
                   double height = scanner.nextDouble();

                   shape = new Cube();
                   ((Cube) shape).setLength(length);
                   ((Cube) shape).setWidth(width);
                   ((Cube) shape).setHeight(height);
                   break;
               }
               case "Sphere": {
                   double radius = scanner.nextDouble();

                   shape = new Sphere();
                   ((Sphere) shape).setRadius(radius);
                   break;
               }
           }

           shapes[i] = shape;
       }

       for (Shape shape : shapes) {
           System.out.println("Area " + shape.area());

           if (shape instanceof Spatial) {
               double volume = shape.volume();
               System.out.println("Volume " + volume);
           }
       }
   }
}
