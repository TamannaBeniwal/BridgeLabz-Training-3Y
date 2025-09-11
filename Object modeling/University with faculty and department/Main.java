public class Main {
    public static <Faculty, University> void main(String[] args) {
        // Create faculty members independently (aggregation)
        Faculty alice = new Faculty("Alice");
        Faculty bob = new Faculty("Bob");
        Faculty carol = new Faculty("Carol");

        // Create university
        University university = new University("Tech University");

        // Add departments (composition)
        university.addDepartment("Computer Science");
        university.addDepartment("Mechanical Engineering");

        // Add faculty (aggregation)
        university.addFaculty(alice);
        university.addFaculty(bob);

        // Show university structure
        System.out.println("Before deletion:");
        university.showStructure();

        // Delete university (composition effect)
        university.deleteUniversity();

        // Show university structure after deletion
        System.out.println("\nAfter deletion:");
        university.showStructure();

        // Faculty still exists (aggregation)
        System.out.println("\nIndependent faculty member (Carol):");
        carol.showDetails();
    }
}
