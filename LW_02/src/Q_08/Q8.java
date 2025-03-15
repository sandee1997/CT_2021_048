package Q_08;

import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input the radius: ");
        int radius= scan.nextInt();
        double volume=  (4.0/3)*(Math.PI*Math.pow(radius,3));
        System.out.println("volume of a sphere is: " + volume);
    }
}
