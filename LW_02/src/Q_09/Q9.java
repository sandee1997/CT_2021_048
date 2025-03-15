package Q_09;

import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("invest dollars: ");
        double P= scan.nextDouble();
        System.out.println("Enter Percentage: ");
        double R= scan.nextDouble();
        System.out.println("How many years: ");
        int N= scan.nextInt();
        double amount=P*(1+Math.pow((R/100),N));
        System.out.println("Amount is: "+amount);
    }
}
