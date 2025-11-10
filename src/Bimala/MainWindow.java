package student.gui;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class MainWindow {
    public void show(Stage stage) {
        Button addBtn = new Button("Add Student");
        Button viewBtn = new Button("View Students");

        addBtn.setOnAction(e -> new AddStudentForm().showForm());
        viewBtn.setOnAction(e -> new ViewStudents().showView());

        VBox root = new VBox(10, addBtn, viewBtn);
        root.setStyle("-fx-padding: 20;");
        stage.setScene(new Scene(root, 300, 200));
        stage.setTitle("Student Management System");
        stage.show();
    }
}
