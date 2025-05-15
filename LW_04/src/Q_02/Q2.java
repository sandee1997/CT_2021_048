package Q_02;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("0.Magenta");
        System.out.println("1.Cyan");
        System.out.println("2.Red");
        System.out.println("3.Blue");
        System.out.println("4.Green");
        System.out.println("Select one color from the above  list:");

        System.out.println("Enter the number between 0-4");
        int number=scanner.nextInt();
        String selection;

        switch (number){
            case 1:
                selection="Magenta";
                break;
            case 2:
                selection="Cyan";
                break;
            case 3:
                selection="Red";
                break;
            case 4:
                selection="Blue";
                break;
            case 5:
                selection="Green";
                break;
            default:
                selection=null;

        }
        if(selection==null){
            System.out.println("invalid selection");
        }
        else{
            System.out.println("your selection "+selection);
        }

    }
}
