package Q_03;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Million -6");
        System.out.println("Billion -9");
        System.out.println("Trillion -12");
        System.out.println("Quadrillion -15");
        System.out.println("Quintillion -18");
        System.out.println("Sextillion -21");
        System.out.println("Nonillion -30");
        System.out.println("Googol -100");
        System.out.println("enter the 10 th power");
        int power=scanner.nextInt();

        String message;
        switch (power){
            case 6:
                message="Million";
                break;
            case 9:
                message="Billion";
                break;

            case 12:
                message="Trillion";
                break;
            case 15:
                message="Quadrillion";
                break;
            case 18:
                message="Quintillion";
                break;
            case 21:
                message="Sextillion";
                break;
            case 30:
                message="Nonillion";
                break;
            case 100:
                message="Googol";
                break;
            default:
                message=null;
                break;
        }
        if(message==null){
            System.out.println("invalid selection");
        }
        else{
            System.out.println("your selection is "+message);
        }



    }

}
