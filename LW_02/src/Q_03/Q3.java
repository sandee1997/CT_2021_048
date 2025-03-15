package Q_03;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" Inputs temperature in degrees Celsius: ");
        int celsius= scan.nextInt();
        double output=1.8*celsius + 32;
        System.out.println("Degrees Fahrenheit: "+output);

    }
}
