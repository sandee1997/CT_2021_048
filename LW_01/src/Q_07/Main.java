package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date today=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss a");
        JFrame window=new JFrame();
        window.setSize(500,600);
        window.setTitle(sdf.format(today));
        window.setVisible(true);
    }
}
