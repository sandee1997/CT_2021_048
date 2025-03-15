package Q_6;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Born year: ");
        int bornYear= scan.nextInt();
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy");
        int age= Integer.parseInt(sdf.format(date))-bornYear;
        System.out.println("You were born in "+ bornYear+" " +"and will be (are)"+" " + age+ " " +"this year");

    }
}
