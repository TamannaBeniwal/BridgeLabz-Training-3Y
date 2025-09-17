public class Employee {
private int empId;
private String empName;
private int empSalary;
private String techStack;

public int getEmpId() {
return empId;
}

public void setEmpId(int empId) {
this.empId = empId;
}

public String getEmpName() {
return empName;
}

public void setEmpName(String empName) {
this.empName = empName;
}

public int getEmpSalary() {
return empSalary;
}

public void setEmpSalary(int empSalary) {
this.empSalary = empSalary;
}

public String getTechStack() {
return techStack;
}

public void setTechStack(String techStack) {
this.techStack = techStack;
}

public Employee() {
}

public Employee(int empId, String empName, int empSalary, String techStack) {
this.empId = empId;
this.empName = empName;
this.empSalary = empSalary;
this.techStack = techStack;
}
}
