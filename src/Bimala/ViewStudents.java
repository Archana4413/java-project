/*
 * ViewStudents.java - Displays list of all students
 * Author: Bimala
 * Date: November 2025
 */

package Bimala;

import Dhruvi.Student;
import Archana.StudentList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewStudents {
    private StudentList studentList = new StudentList();

    public void show() {
        Stage stage = new Stage();
        stage.setTitle("View Students");

        ListView<String> listView = new ListView<>();

        if (studentList.getStudents().isEmpty()) {
            listView.getItems().add("No students available.");
        } else {
            for (Student s : studentList.getStudents()) {
                listView.getItems().add(s.getName() + " (" + s.getStudentID() + ") - " + s.getMarks() + " marks");
            }
        }

        VBox box = new VBox(10, listView);
        box.setStyle("-fx-padding: 20;");

        stage.setScene(new Scene(box, 400, 300));
        stage.show();
    }
}
