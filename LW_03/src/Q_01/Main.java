package Q_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        double celsius= scan.nextDouble();

        Temperature temp=new Temperature();
        temp.setCelsius(celsius);
        System.out.println("Temperature in fahrenheit:"+temp.toFahrenheit());
        //Q2

        System.out.println("Enter the temperature in fahrenheit:");
        double fahrenheit= scan.nextDouble();
        Temperature temp1=new Temperature();
        temp1.setFahrenheit(fahrenheit);
        System.out.println("Temperature in celsius:"+temp1.toCelsius());


    }
}
