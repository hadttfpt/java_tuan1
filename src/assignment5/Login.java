package assignment5;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
    public TextField txtUsername;
    public PasswordField txtPassword;

    public void Login(){
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        if(username.equals(username)||password.equals(password)){
            return;
        }else {
            txtUsername.setText("UserName không tông tại");
            txtPassword.setText("Pass không đúng");
        }
    }

    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void register() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
