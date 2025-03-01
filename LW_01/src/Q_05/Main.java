package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("EEEE,MMMM MM,yyyy");
        Date today=new Date();
        System.out.println(sdf.format(today));
    }
}
