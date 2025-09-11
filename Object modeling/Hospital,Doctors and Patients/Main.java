public class Main {
    public static <Hospital, Doctor> void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor drSmith = new Doctor("Smith");
        Doctor drJones = new Doctor("Jones");

        // Create patients
        Patient alice = new Patient("Alice");
        Patient bob = new Patient("Bob");

        // Add to hospital
        hospital.addDoctor(drSmith);
        hospital.addDoctor(drJones);
        hospital.addPatient(alice);
        hospital.addPatient(bob);

    
        drSmith.consult(alice);
        drSmith.consult(bob);
        drJones.consult(bob);

        // Show data
        System.out.println();
        hospital.showAllDoctors();
        hospital.showAllPatients();

        System.out.println();
        drSmith.showPatients();
        drJones.showPatients();

        System.out.println();
        alice.showDoctors();
        bob.showDoctors();
    }
}
