import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association: Student ↔ Course
    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // bidirectional link
            System.out.println(name + " enrolled in course: " + course.getCourseName());
        }
    }

    public void showEnrolledCourses() {
        System.out.println("Courses enrolled by " + name + ":");
        if (enrolledCourses.isEmpty()) {
            System.out.println("  None");
        } else {
            for (Course c : enrolledCourses) {
                System.out.println("  - " + c.getCourseName());
            }
        }
    }
}
