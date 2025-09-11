import java.util.ArrayList;
import java.util.List;

public class Doctor<Patient> {
    private String name;
    private List<Patient> patients;

    public Doctor(String name) {
        this.name = name;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void consult(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
            patient.addDoctor(this); // ensure bidirectional
        }
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());
    }

    public void showPatients() {
        System.out.println("Dr. " + name + "'s patients:");
        if (patients.isEmpty()) {
            System.out.println("  No patients.");
        } else {
            for (Patient p : patients) {
                System.out.println("  - " + p.getName());
            }
        }
    }
}
