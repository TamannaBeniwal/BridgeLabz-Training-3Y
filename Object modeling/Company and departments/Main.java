public class Main {
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("TechCorp");

        // Add departments
        company.addDepartment("Engineering");
        company.addDepartment("HR");

        // Add employees to departments
        Company.Department engineering = company.getDepartment("Engineering");
        Company.Department hr = company.getDepartment("HR");

        if (engineering != null) {
            engineering.addEmployee("Alice");
            engineering.addEmployee("Bob");
        }

        if (hr != null) {
            hr.addEmployee("Charlie");
        }

        // Show company structure
        company.showStructure();

        // Delete company (simulate composition)
        company.deleteCompany();

        // Try to show structure again
        System.out.println("\nAfter deletion:");
        company.showStructure(); // Should show nothing
    }
}
