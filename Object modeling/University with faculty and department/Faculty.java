public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void showDetails() {
        System.out.println("Faculty: " + name);
    }
}
