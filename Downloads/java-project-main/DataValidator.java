public class DataValidator {
    public static boolean isValidStudentId(String studentId) throws CustomException {
        if (studentId == null || studentId.trim().isEmpty()) {
            throw new CustomException("Student ID cannot be null or empty");
        }
        if (studentId.length() < 3) {
            throw new CustomException("Student ID must be at least 3 characters long");
        }
        return true;
    }
}