public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showDetails() {
        System.out.println("  Department: " + name);
    }
}
