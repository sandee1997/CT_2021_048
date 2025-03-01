package Q_04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy");
        Date today=new Date();
        System.out.println(sdf.format(today));
    }

}
