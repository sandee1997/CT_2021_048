package Q_04;

import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the weight in kg: ");
        int weight=scan.nextInt();
        float weightP= (float) (weight*2.2);
        float calories=weightP*19;
        System.out.println(calories);

    }
}
