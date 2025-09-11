public class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenwood High");

        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        // Add students to the school (aggregation)
        school.addStudent(alice);
        school.addStudent(bob);
        school.addStudent(charlie);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course art = new Course("Art");

        // Enroll students in courses (association)
        alice.enrollInCourse(math);
        alice.enrollInCourse(science);

        bob.enrollInCourse(math);
        bob.enrollInCourse(art);

        charlie.enrollInCourse(art);

        // Show students in school
        System.out.println();
        school.showAllStudents();

        // Each student views their courses
        System.out.println();
        alice.viewCourses();
        bob.viewCourses();
        charlie.viewCourses();

        // Each course shows enrolled students
        System.out.println();
        math.showEnrolledStudents();
        science.showEnrolledStudents();
        art.showEnrolledStudents();
    }
}
