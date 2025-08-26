package StringLevel1;

public class NullPointerExceptionDemo {
    public static void generateNullPointerException() {
        String text = null;  
        System.out.println("Text length: " + text.length());
    }
    public static void handleNullPointerException() {
        String text = null;

        try {
            
            System.out.println("Text length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Attempted to access method on null object.");
        }
    }


    public static void main(String[] args) {
        System.out.println("Demonstrating NullPointerException:");

       
        System.out.println("Handling NullPointerException properly:");
        handleNullPointerException();
    }
}