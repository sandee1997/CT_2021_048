package Q_05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("input temperature in degrees Fahrenheit");
        double fahrenheit =scan.nextDouble();
        double celsius=(fahrenheit-32) * 5/9;
        System.out.println(celsius);
    }
}
