import java.util.ArrayList;
import java.util.List;

public class Professor {
    private String name;
    private List<Course> teachingCourses;

    public Professor(String name) {
        this.name = name;
        this.teachingCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association: Professor ↔ Course
    public void assignCourse(Course course) {
        if (!teachingCourses.contains(course)) {
            teachingCourses.add(course);
            course.setProfessor(this); // bidirectional link
            System.out.println("Professor " + name + " assigned to course: " + course.getCourseName());
        }
    }

    public void showTeachingCourses() {
        System.out.println("Courses taught by Professor " + name + ":");
        if (teachingCourses.isEmpty()) {
            System.out.println("  None");
        } else {
            for (Course c : teachingCourses) {
                System.out.println("  - " + c.getCourseName());
            }
        }
    }
}
