package assignment2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    public static ArrayList<String> studentList = new ArrayList<>();

    public static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        mainStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("add.fxml"));
        primaryStage.setTitle("Them sinh vien");
        primaryStage.setScene(new Scene(root,600,400));
        primaryStage.show();
    }
}

