import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Aggregation: Course ↔ Professor
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Aggregation: Course ↔ Student
    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("  Professor: " + (professor != null ? professor.getName() : "None"));
        System.out.println("  Enrolled Students:");
        if (enrolledStudents.isEmpty()) {
            System.out.println("    None");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println("    - " + s.getName());
            }
        }
    }
}
