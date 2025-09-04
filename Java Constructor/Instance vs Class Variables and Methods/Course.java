public class Course {
    private String courseName;
    private String duration;
    private double fee;

    // Static class variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
        System.out.println("Institute: " + instituteName);
        System.out.println();
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}