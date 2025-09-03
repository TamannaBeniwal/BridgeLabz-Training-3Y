// package Java Class and Object.level2;
import java.util.*;
public class StudentMain {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter name of student: ");
        String name=sc.nextLine();

        System.out.println("enter rollno of student: ");
        int rollno=sc.nextInt();

        System.out.println("enter marks of student: ");
        double marks=sc.nextDouble();

        Student s=new Student(name, rollno, marks);
        s.display();

        

    }
    
}
