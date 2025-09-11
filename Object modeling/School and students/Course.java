import java.util.ArrayList;
import java.util.List;

public class Course<enrolledStudents, Student> {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    // Add student (association)
    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    // Show students enrolled in the course
    public <enrolledStudents> void showEnrolledStudents() {
        System.out.println("Course: " + courseName);
        if (enrolledStudents.isEmpty()) {
            System.out.println("  No students enrolled.");
        } else {
            for (Student s : enrolledStudents) {
                System.out.println("  - " + s.getName());
            }
        }
    }
}
