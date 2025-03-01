package Q_11;
import java.util.Scanner;
public class Q11 {
        public static void main(String[] args) {
            Scanner name=new Scanner(System.in);
            String firstName,lastName,middleName;
            System.out.println("Enter your FistName");
            firstName=name.next();
            System.out.println("Enter your middleName");
            middleName=name.next();
            System.out.println("Enter your LastName");
            lastName=name.next();
            String middleInitial=middleName.substring(0,1);
            System.out.println(lastName+","+firstName+" "+middleInitial+".");

        }

    }

