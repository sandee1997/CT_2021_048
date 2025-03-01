package Q_08;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name;
        Scanner scan=new Scanner(System.in);
        name=scan.nextLine();
        int length=name.length();
        int index=name.indexOf('!');
        System.out.println(name.substring(0,index));
        System.out.println(name.substring(index+1,length));
    }
}
