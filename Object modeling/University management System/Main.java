public class Main {
    public static void main(String[] args) {
        // Create students
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");

        // Create professors
        Professor profSmith = new Professor("Dr. Smith");
        Professor profJones = new Professor("Dr. Jones");

        // Create courses
        Course math = new Course("Mathematics");
        Course cs = new Course("Computer Science");

        // Assign professors to courses
        profSmith.assignCourse(math);
        profJones.assignCourse(cs);

        // Enroll students
        alice.enrollCourse(math);
        alice.enrollCourse(cs);
        bob.enrollCourse(cs);

        // Show data
        System.out.println();
        alice.showEnrolledCourses();
        bob.showEnrolledCourses();

        System.out.println();
        profSmith.showTeachingCourses();
        profJones.showTeachingCourses();

        System.out.println();
        math.showCourseDetails();
        cs.showCourseDetails();
    }
}
