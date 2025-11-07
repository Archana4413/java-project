/**
 * Student Management System - Main Class
 * Demonstrates inheritance, exception handling, and file operations
 */
public class Main {
    public static void main(String[] args) {
        try {
            // Array of 30 student names for demonstration
            String[] names = {"John Doe", "Jane Smith", "Mike Johnson", "Sarah Wilson", "David Brown", "Lisa Davis", "Tom Miller", "Anna Garcia", "Chris Martinez", "Emma Rodriguez", "Ryan Lopez", "Olivia Hernandez", "Kevin Gonzalez", "Sophia Perez", "Daniel Sanchez", "Isabella Ramirez", "Matthew Torres", "Mia Flores", "Andrew Rivera", "Charlotte Cook", "Joshua Bailey", "Amelia Cooper", "Christopher Reed", "Harper Kelly", "Anthony Howard", "Evelyn Ward", "Mark Cox", "Abigail Diaz", "Steven Richardson", "Emily Wood"};
            
            // Display professional students table header
            System.out.println("\n╔══════════════════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                                  STUDENTS RECORD                                 ║");
            System.out.println("╠══════╦══════════════════════╦═══════╦═══════════╦═══════════════════════════════╣");
            System.out.printf("║ %-4s ║ %-20s ║ %-5s ║ %-9s ║ %-29s ║%n", "No.", "Name", "Age", "ID", "Marks");
            System.out.println("╠══════╬══════════════════════╬═══════╬═══════════╬═══════════════════════════════╣");
            
            // Create and display 30 students
            for (int i = 0; i < 30; i++) {
                // Create student with calculated age and marks
                Student student = new Student(names[i], 18 + (i % 8), "STU" + String.format("%03d", i + 1), 60 + (i * 2.5) % 40);
                // Validate student ID using custom validator
                DataValidator.isValidStudentId(student.getStudentId());
                // Save student data to file
                StudentData.saveStudent(student);
                // Display student in table format
                System.out.printf("║ %-4d ║ %-20s ║ %-5d ║ %-9s ║ %-29.1f ║%n", i + 1, student.getName(), student.getAge(), student.getStudentId(), student.getMarks());
            }
            // Close students table
            System.out.println("╚══════╩══════════════════════╩═══════╩═══════════╩═══════════════════════════════╝");
            
            // Arrays for 10 teachers data
            String[] teacherNames = {"Dr. Robert Johnson", "Prof. Maria Garcia", "Mr. James Wilson", "Ms. Linda Brown", "Dr. Michael Davis", "Prof. Jennifer Miller", "Mr. William Moore", "Ms. Patricia Taylor", "Dr. Richard Anderson", "Prof. Susan Thomas"};
            String[] subjects = {"Mathematics", "Physics", "Chemistry", "Biology", "English", "History", "Geography", "Computer Science", "Economics", "Psychology"};
            
            // Display professional teachers table header
            System.out.println("\n\n╔═════════════════════════════════════════════════════════════════════╗");
            System.out.println("║                              TEACHERS RECORD                              ║");
            System.out.println("╠══════╦══════════════════════╦═══════╦═══════════════════════════════╣");
            System.out.printf("║ %-4s ║ %-20s ║ %-5s ║ %-29s ║%n", "No.", "Name", "Age", "Subject");
            System.out.println("╠══════╬══════════════════════╬═══════╬═══════════════════════════════╣");
            
            // Create and display 10 teachers
            for (int i = 0; i < 10; i++) {
                // Create teacher with calculated age
                Teacher teacher = new Teacher(teacherNames[i], 30 + (i * 3), subjects[i]);
                // Display teacher in table format
                System.out.printf("║ %-4d ║ %-20s ║ %-5d ║ %-29s ║%n", i + 1, teacher.getName(), teacher.getAge(), teacher.getSubject());
            }
            // Close teachers table
            System.out.println("╚══════╩══════════════════════╩═══════╩═══════════════════════════════╝");
            
        } catch (CustomException e) {
            // Handle custom exceptions with error message
            System.err.println("Error: " + e.getMessage());
        }
    }
}