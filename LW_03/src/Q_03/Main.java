package Q_03;

import java.awt.geom.Area;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Outer radius:");
        double outerRadius=scan.nextDouble();

        System.out.println("Enter the Inner radius:");
        double innerRadius=scan.nextDouble();

        Circle outerCircle=new Circle(outerRadius);
        Circle innerCircle=new Circle(innerRadius);

        double area=outerCircle.computeArea()-innerCircle.computeArea();
        System.out.println("Area is:"+area);


    }
}
