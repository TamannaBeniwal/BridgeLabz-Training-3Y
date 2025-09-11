import java.util.ArrayList;
import java.util.List;

public class Patient<Doctor> {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    public void showDoctors() {
        System.out.println("Patient " + name + "'s doctors:");
        if (doctors.isEmpty()) {
            System.out.println("  No doctors consulted yet.");
        } else {
            for (Doctor d : doctors) {
                System.out.println("  - Dr. " + d.getName());
            }
        }
    }
}
