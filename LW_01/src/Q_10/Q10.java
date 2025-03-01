package Q_10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        String word = scan.next();
        int length = word.length();
        int middleIndex = 0;
        if (length % 2 == 1) {
            middleIndex = length / 2;
            System.out.println("Middle character=" + word.substring(middleIndex, middleIndex + 1));
        }
        else
        {
            System.out.println("Error");
        }
    }
}
