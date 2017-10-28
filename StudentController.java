package application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class StudentController {
@FXML
TextField txtName;
@FXML
ComboBox<String> cmbGender;
@FXML
Button btnSave;
@FXML
Button btnClear;
@FXML
Label lblSave;
public void saveStudent(ActionEvent e){
Student student= new Student(txtName.getText(),
 cmbGender.getValue().toString());
student.saveStudent();
lblSave.setText("Saved");
}
public void clearData(){
cmbGender.setValue(null);
txtName.setText("");
lblSave.setText("");
}
}
