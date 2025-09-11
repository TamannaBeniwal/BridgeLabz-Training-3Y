import java.util.ArrayList;
import java.util.List;

public class University<Department, Faculty> {
    private String name;
    private List<Department> departments;  // Composition
    private List<Faculty> facultyMembers;  // Aggregation

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.facultyMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Add department (composition)
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Add faculty member (aggregation)
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    public void showStructure() {
        System.out.println("University: " + name);
        
        System.out.println("Departments:");
        if (departments.isEmpty()) {
            System.out.println("  No departments.");
        } else {
            for (Department d : departments) {
                d.showDetails();
            }
        }

        System.out.println("Faculty Members:");
        if (facultyMembers.isEmpty()) {
            System.out.println("  No faculty members.");
        } else {
            for (Faculty f : facultyMembers) {
                System.out.println("  - " + f.getName());
            }
        }
    }

    // Simulate deleting the university (and its departments)
    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + name);
        departments.clear();  // Composition: departments are deleted
        // Faculty is not cleared (aggregation)
        System.out.println("University and its departments deleted. Faculty remains.");
    }
}
