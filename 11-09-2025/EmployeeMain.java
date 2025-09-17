public class EmployeeMain {
public static void main(String[] args) {
// Employee emp = new Employee(100,
// "Amit",50000,
// "Java Fullstack");
Employee emp = new Employee();

emp.setEmpId(200);

System.out.println(emp.getEmpId());
System.out.println(emp.getEmpName());
System.out.println(emp.getTechStack());

}
}