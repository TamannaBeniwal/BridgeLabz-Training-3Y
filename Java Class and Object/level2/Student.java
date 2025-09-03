// package Java Class and Object.level2;

public class Student {
    String name;
    int rollno;
    double marks;

    public Student(String name, int rollno, double marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
    }
    public String calculategrade(){
        if(marks>=90){
            return "A";
        }
        else if(marks>=80){
            return "B";
        }
        else if(marks>=70){
            return "C";
        }
        else if(marks>=60){
            return "D";
        }
        else if(marks>=50){
            return "E";
        }
        else{
            return "F";
        }

    }
    public void display(){
        System.out.println("Student Details: ");
        System.out.println("name: "+ name);
        System.out.println("rollno: "+rollno);
        System.out.println("grade: "+calculategrade());
        System.out.println("marks: "+marks);
    }
    
}
