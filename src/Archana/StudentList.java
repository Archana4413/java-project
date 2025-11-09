import java.util.*;

public class StudentList {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void displayStudents() {
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addStudent(new Student(1, "Archana", 88));
        list.addStudent(new Student(2, "Rahul", 75));
        list.addStudent(new Student(3, "Priya", 92));
        list.displayStudents();
    }
}