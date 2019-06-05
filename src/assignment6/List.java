package assignment6;

import constructor.Constructor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class List implements Initializable {
    public TableView<User> tbView;

    public TableColumn<User,Integer> colId;
    public TableColumn<User,String> colUsername;
    public TableColumn<User,String> colEmail;
    public TableColumn<User,String> colPassword;
    public TableColumn<User, Button> colEdit;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
        colEdit.setCellValueFactory(new PropertyValueFactory<>("edit"));

        String sql = "SELECT * FROM user";
        try {

            Constructor cn = Constructor.getInstance();
            ResultSet r = cn.getQuery(sql);

            ObservableList<User> list = FXCollections.observableArrayList();

            while (r.next()){
                Integer id = r.getInt("id");
                String username = r.getString("username");
                String email = r.getString("email");
                String password = r.getString("password");

                User u = new User(id,username,email,password);
                list.add(u);
                u.updateButton();
            }

            tbView.setItems(list);

        }catch (Exception e){

        }
    }

    public void home()throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }

    public void register() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("register.fxml"));
        Main.MainStage.getScene().setRoot(root);
    }
}
