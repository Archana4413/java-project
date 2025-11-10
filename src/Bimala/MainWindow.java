/*
 * MainWindow.java - Main window for the Student Management System
 * Author: Bimala
 * Date: November 2025
 */

package Bimala;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainWindow extends Application {
    @Override
    public void start(Stage stage) {
        Button addBtn = new Button("Add Student");
        Button viewBtn = new Button("View Students");

        addBtn.setOnAction(e -> new AddStudentForm().show());
        viewBtn.setOnAction(e -> new ViewStudents().show());

        VBox root = new VBox(15, addBtn, viewBtn);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        stage.setTitle("Student Management System");
        stage.setScene(new Scene(root, 300, 200));
        stage.show();
    }
}
