import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses; // Association

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // bidirectional
        }
    }

    // View courses enrolled
    public void viewCourses() {
        System.out.println("Student: " + name);
        if (courses.isEmpty()) {
            System.out.println("  Not enrolled in any courses.");
        } else {
            for (Course c : courses) {
                System.out.println("  - " + c.getCourseName());
            }
        }
    }
}
