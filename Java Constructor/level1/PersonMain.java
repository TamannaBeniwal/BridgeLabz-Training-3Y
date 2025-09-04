public class PersonMain {
    public static void main(String[] args) {
        Person original = new Person("tamanna", 18, "Female");
        System.out.println("Original Person:");
        original.displayInfo();

        System.out.println();

    
        Person clone = new Person(original);
        System.out.println("Cloned Person:");
        clone.displayInfo();
    }
}