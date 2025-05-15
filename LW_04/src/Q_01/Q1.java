package Q_01;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Input three integers:");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3= scan.nextInt();

        int smallest=num1;
        if(num2<smallest){
            smallest=num2;
        }
        if(num3<smallest){
            smallest=num3;
        }
        System.out.println(smallest);
    }

}
