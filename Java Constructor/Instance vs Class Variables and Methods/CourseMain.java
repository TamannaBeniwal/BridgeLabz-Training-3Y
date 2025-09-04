public class CourseMain {
    public static void main(String[] args) {
    
        Course.updateInstituteName("GLA University");

    
        Course c1 = new Course("Java Programming", "6 weeks", 2000);
        Course c2 = new Course("Web Development", "8 weeks", 2000);
        Course c3 = new Course("Data Science", "10 weeks", 2000);

        // Display course details
        System.out.println("Course Details:\n");
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();

        
        Course.updateInstituteName("Learning Hub");


        System.out.println("After updating institute name:\n");
        c1.displayCourseDetails();
    }
}
