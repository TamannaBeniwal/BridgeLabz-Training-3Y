package StringLevel1;
import java.util.Scanner;
public class CharacterArrayComparer {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=sc.next();

        char[] Array = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            Array[i] = s.charAt(i);
        }
         char[] builtInArray = s.toCharArray();
         boolean Equal = true;
        if (Array.length != builtInArray.length) {
            Equal = false;
        } else {
            for (int i = 0; i < Array.length; i++) {
                if (Array[i] != builtInArray[i]) {
                    Equal = false;
                    break;
                }
            }
        }
        System.out.print("Manual Array: ");
        for (char c : Array) {
            System.out.print(c + " ");
        }

        System.out.print("\nBuilt-in Array: ");
        for (char c : builtInArray) {
            System.out.print(c + " ");
        }
        System.out.println("\nAre both arrays equal? " + Equal);

        sc.close();
    }
    
}

