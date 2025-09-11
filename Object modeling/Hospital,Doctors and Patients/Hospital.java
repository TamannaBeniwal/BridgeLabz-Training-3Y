import java.util.ArrayList;
import java.util.List;

public class Hospital<Doctor, Patient> {
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showAllDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("  - Dr. " + d.getName());
        }
    }

    public void showAllPatients() {
        System.out.println("Patients at " + name + ":");
        for (Patient p : patients) {
            System.out.println("  - " + p.getName());
        }
    }
}
