package assignment6;

import constructor.Constructor;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import assignment7.Dao;
import java.net.URL;
import java.util.ResourceBundle;

public class Edit implements Initializable {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public static User userEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        txtUsername.setText(userEdit.getUsername());
        txtEmail.setText(userEdit.getEmail());
        txtPassword.setText(userEdit.getPassword());
    }

    public void update(){
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();
        try {
            User us = new User(null,username,email,password);
            UserDao ud = UserDao.getInstance();
            ud.create(us);
        }
        catch (Exception e){

        }
    }
    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}