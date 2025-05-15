package Q_05;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Tofu Burger-$3.49");
        System.out.println("Cajun Chicken-$4.59 ");
        System.out.println("Buffalo Wings-$3.99");
        System.out.println("Rainbow Fillet -$2.99");

        System.out.println("enter the number between 1-4(entree)");
        int number= scanner.nextInt();

        String food;
        float price =0;
        switch (number){
            case 1:
                food="Tofu Burger";
                price= 3.49F;
                break;
            case 2:
                food="Cajun Chicken";
                price= 4.59F;
                break;
            case 3:
                food="Buffalo Wings";
                price= 3.99F;
                break;
            case 4:
                food="Rainbow Fillet";
                price= 2.99F;
                break;
            default:
                food=null;
                break;


        }
        if(food==null){
            System.out.println("invalid input");
        }
        else{
            System.out.println("the entree is "+food+" "+"$"+price);
        }


        System.out.println("Rice Cracker -$0.79");
        System.out.println("No-Salt Fries -$0.69 ");
        System.out.println("Zucchini-$1.09");
        System.out.println("Brown Rice -$0.59");

        System.out.println("enter the number between 1-4(Side Dish)");
        int number1= scanner.nextInt();

        String side_Dish;
        float price1 =0;
        switch (number1){
            case 1:
                side_Dish="Rice Cracker";
                price1= 0.79F;
                break;
            case 2:
                side_Dish="No-Salt Fries ";
                price1= 0.69F;
                break;
            case 3:
                side_Dish="Zucchini ";
                price1= 1.09F;
                break;
            case 4:
                side_Dish="Brown Rice";
                price1= 0.59F;
                break;
            default:
                side_Dish=null;
                break;


        }
        if(side_Dish==null){
            System.out.println("invalid input");
        }
        else{
            System.out.println("the Side Dish is "+side_Dish+" "+"$"+price1);
        }


        System.out.println("Cafe Mocha -$1.99");
        System.out.println("Cafe Latte -$1.90 ");
        System.out.println("Espresso-$2.49");
        System.out.println("Oolong Tea  -$0.99");

        System.out.println("enter the number between 1-4(Drink)");
        int number2= scanner.nextInt();

        String Drink;
        float price2 =0;
        switch (number2){
            case 1:
                Drink="Cafe Mocha";
                price2= 1.99F;
                break;
            case 2:
                Drink=" Cafe Latte  ";
                price2= 1.90F;
                break;
            case 3:
                Drink=" Espresso ";
                price2= 2.49F;
                break;
            case 4:
                Drink=" Oolong Tea";
                price2= 0.99F;
                break;
            default:
                Drink=null;
                break;


        }
        if(Drink==null){
            System.out.println("invalid input");
        }
        else{
            System.out.println("the Drink is "+Drink+" "+"$"+price2);
        }


    }
}
