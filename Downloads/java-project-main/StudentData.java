import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentData {
    private static final String FILE_NAME = "students.txt";
    
    public static void saveStudent(Student student) throws CustomException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME, true))) {
            writer.println(student.getName() + "," + student.getAge() + "," + 
                          student.getStudentId() + "," + student.getMarks());
        } catch (IOException e) {
            throw new CustomException("Error saving student data: " + e.getMessage());
        }
    }
    
    public static List<Student> loadStudents() throws CustomException {
        List<Student> students = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    students.add(new Student(parts[0], Integer.parseInt(parts[1]), 
                                           parts[2], Double.parseDouble(parts[3])));
                }
            }
        } catch (IOException e) {
            throw new CustomException("Error loading student data: " + e.getMessage());
        }
        return students;
    }
}