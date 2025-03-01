package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class SampleWindow1 {
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        String firstName,lastName;
        System.out.println("Enter your FistName");
        firstName=name.next();
        System.out.println("Enter your LastName");
        lastName=name.next();

        JFrame myWindow=new JFrame();
        myWindow.setSize(300,400);
        myWindow.setTitle(firstName+" " + lastName);
        myWindow.setVisible(true);

    }
}
