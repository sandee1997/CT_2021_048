package Q_04;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year ");
        int year=scanner.nextInt();
        boolean isLeapYear=false;

        if(year%4==0){
            if(year%400==0 || year%100!=0){
                isLeapYear=true;

            }

        }
        if(isLeapYear){
            System.out.println("This year is a leap year= "+year);
        }
        else{
            System.out.println("This year is not  a leap year= "+year);
        }
    }
}
