package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        JFrame window=new JFrame();
        Scanner scan=new Scanner(System.in);
        int width,height;
        String title;
        System.out.println("Enter width and height:");
        width=scan.nextInt();
        height=scan.nextInt();
        System.out.println("Enter Title:");
        title=scan.next();
        window.setSize(width,height);
        window.setTitle(title);
        window.setVisible(true);

    }
}
