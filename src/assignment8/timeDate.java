package assignment8;

import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class timeDate extends Thread {
    public TextField txtTime;
    public TextField txtDate;

    public void start() {
        LocalDate ld = LocalDate.now();
        LocalTime ld1 = LocalTime.now();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                int h = ld1.getHour();
                int m = ld1.getMinute();
                int s = ld1.getSecond();
                txtDate.setText(String.valueOf(ld));
                for (int j = h; j < 24; j++) {
                    for (int i = m; i < 60; i++) {
                        for (int k = s; k < 60; k++) {
                            txtTime.setText(String.format("%02d", j) + ":" + String.format("%02d", i) + ":" + String.format("%02d", k));
                            if (k == 59) {
                                s = 0;
                            }
                            if (i == 59) {
                                m = 0;
                                h++;
                            }
                            try {
                                Thread.sleep(1000);
                            } catch (Exception e) {

                            }
                        }
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
