package assignment6;
import constructor.Constructor;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
public class Register {
    public TextField txtUsername;
    public TextField txtEmail;
    public PasswordField txtPassword;

    public void register(){
        String username = txtUsername.getText();
        String email = txtEmail.getText();
        String password = txtPassword.getText();

        String sql = "Insert into user (username,email,password) " +
                " VALUES('"+username+"','"+email+"','"+password+"')";
        try {
            Constructor cn = Constructor.getInstance();
            int number = cn.updateQuery(sql);
            if(number>0){
                goToList();
            }
        }catch (Exception e){

        }

    }

    public void home() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void login() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void goToList() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

}