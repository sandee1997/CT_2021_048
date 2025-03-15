package Q_02;

import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter values in centimeters");
        int value= scan.nextInt();
        float outputInches= (float) (value/2.54);
        float outputFeet=outputInches/12;
        System.out.println(outputInches + " " + outputFeet);
    }
}
