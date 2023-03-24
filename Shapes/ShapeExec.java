import java.util.*;
public class ShapeExec {
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        while (true) {
            System.out.println("Select one:\n1.Sphere\n2.Cube\n3.Cuboid\n4.Cylinder\n5.Exit");
            System.out.print("Enter your choice(1-5): ");
            int choice= obj.nextInt();
            System.out.println();
            if (choice == 1) {
                int radius = obj.nextInt();
                newSphere mySphere = new newSphere(radius);
                mySphere.execute();
            }
            else if (choice == 2) {
                int sides = obj.nextInt();
                newCube mycube = new newCube(sides);
                mycube.execute();
            }
            else if (choice == 3) {
                int length = obj.nextInt();
                int breadth= obj.nextInt();
                int height = obj.nextInt();
                newCuboid mycuboid = new newCuboid(length, breadth, height);
                mycuboid.execute();
            }
                else if (choice == 4) {
                int radii = obj.nextInt();
                int heigh = obj.nextInt();
                newCylinder mycylinder = new newCylinder(radii, heigh);
                mycylinder.execute();
            }
            else if (choice == 5) {
                break;
            }
            else {
                System.out.println("Invalid choice");
            }
            System.out.println();
            System.out.print("Do you want to continue: ");
            String cont= obj.next();
            if (cont.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println();
        }
        obj.close();
    }
}