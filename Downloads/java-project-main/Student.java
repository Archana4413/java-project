public class Student extends Person {
    private String studentId;
    private double marks;
    
    public Student(String name, int age, String studentId, double marks) {
        super(name, age);
        this.studentId = studentId;
        this.marks = marks;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    
    public double getMarks() {
        return marks;
    }
    
    public void setMarks(double marks) {
        this.marks = marks;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", Marks: " + marks;
    }
}