package Q_09;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String string;
        string=scan.nextLine();
        int length=string.length();
        System.out.println(length);
        System.out.println(string.substring(0,1));
        System.out.println(string.substring(length-1,length));


    }
}
