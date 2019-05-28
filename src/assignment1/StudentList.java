package assignment1;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.Collections;
import java.util.Comparator;
import java.util.ResourceBundle;

public class StudentList implements Initializable {
    public TextArea txtList;
    public boolean flag;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String str  = "";
        for (Student s : Main.studentList){
            str+=(s+"\n");
        }
        txtList.setText(str);
    }

    public void toAdd() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("addsv.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }

    public void sapXep() {
        if (flag) {
            Collections.sort(Main.studentList, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return (o1.mark.compareTo(o2.mark));
                }
            });
        } else {
            Collections.sort(Main.studentList, new Comparator<Student>() {
                @Override
                public int compare(Student o1, Student o2) {
                    return (o2.mark.compareTo(o1.mark));
                }
            });
        }
        String str = "";
        for (Student s : Main.studentList) {
            str += s.name+" "+s.age+" "+s.mark + "\n";
        }
        txtList.setText(str);
    }
}

