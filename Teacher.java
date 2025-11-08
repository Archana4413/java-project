/**
 * Teacher class - Extends Person class
 * Demonstrates inheritance by adding teacher-specific attributes
 */
public class Teacher extends Person {
    private String subject;
    
    // Constructor using super() to call parent constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);  // Call parent constructor
        this.subject = subject;
    }
    
    // Getter method for subject
    public String getSubject() {
        return subject;
    }
    
    // Setter method for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    // Override toString method to include teacher-specific information
    @Override
    public String toString() {
        return super.toString() + ", Subject: " + subject;
    }
}
