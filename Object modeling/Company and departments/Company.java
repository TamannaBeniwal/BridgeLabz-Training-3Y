import java.util.ArrayList;
import java.util.List;

public class Company<employees> {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    public Department getDepartment(String deptName) {
        for (Department dept : departments) {
            if (dept.getName().equals(deptName)) {
                return dept;
            }
        }
        return null;
    }

    public void showStructure() {
        System.out.println("Company: " + name);
        for (Department dept : departments) {
            dept.showDetails();
        }
    }

    // Simulate deletion of company and its parts
    public void deleteCompany() {
        System.out.println("\nDeleting Company: " + name);
        for (Department dept : departments) {
            dept.clearEmployees();  // delete all employees
        }
        departments.clear(); // delete all departments
        System.out.println("Company, departments, and employees deleted.");
    }

    // Inner class: Department is part of Company (composition)
    public class Department<Employee> {
        private String name;
        private List<Employee> employees;

        public Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void addEmployee(String empName) {
            employees.add(new Employee(empName));
        }

        public void showDetails() {
            System.out.println("  Department: " + name);
            for (Employee emp : employees) {
                emp.showDetails();
            }
        }

        public void clearEmployees() {
            employees.clear();
        }
    }
}
