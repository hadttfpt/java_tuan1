package assignment1;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;

public class Studentsv {
    public TextField txtName;
    public TextField txtAge;
    public TextField txtMark;

    public void themSV() {
        String name = txtName.getText();
        Integer age = Integer.parseInt(txtAge.getText());
        Double mark = Double.parseDouble(txtMark.getText());

        Student st = new Student(name, age, mark);
        Main.studentList.add(st);
        txtName.setText("");
        txtAge.setText("");
        txtMark.setText("");

        for (Student s: Main.studentList){
            System.out.println(s.name+" "+s.age+" "+s.mark);
        }
    }


    public void toListPane() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("list.fxml"));
        Main.mainStage.getScene().setRoot(root);
    }
}
