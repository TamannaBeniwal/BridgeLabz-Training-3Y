import java.util.ArrayList;
import java.util.List;

public class School<Student> {
    private String name;
    private List<Student> students; // Aggregation

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add student to school (aggregation)
    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("School: " + name);
        for (Student s : students) {
            System.out.println("  - " + s.getName());
        }
    }
}
