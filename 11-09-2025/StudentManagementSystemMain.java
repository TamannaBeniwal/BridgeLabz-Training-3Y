public class StudentManagementSystemMain {
    public static void main(String[] args) {
        Student s1 = new Student("tamanna", 18, 'B');
        System.out.println(s1.getName() + " | Age: " + s1.getAge() + " | Grade: " + s1.getGrade());


        s1.updateGrade('A');
        System.out.println("Updated Grade: " + s1.getGrade());

    
        Student s2 = new Student("kirti", 19, 'A');
        System.out.println(s2.getName() + " | Age: " + s2.getAge() + " (Invalid age handled)");
    }
}