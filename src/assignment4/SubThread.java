package assignment4;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

public class SubThread extends Thread {

    public TextArea txtArea;

    public void Start() throws Exception {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int j = 9; j >= 0; j--) {
                    for (int i = 59; i > 0; i--) {
                       txtArea.setText (String.format("%02d", j) + ":" + String.format("%02d", i));
                        try {
                            Thread.sleep(1000);
                        } catch (Exception e) {

                        }
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}
