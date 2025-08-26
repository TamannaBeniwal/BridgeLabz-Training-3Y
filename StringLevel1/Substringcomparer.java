package StringLevel1;
import java.util.Scanner;
public class Substringcomparer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a string: ");
        String s=sc.next();

        System.out.print("enter starting index: ");
        int start=sc.nextInt();

        System.out.print("enter ending index: ");
        int end=sc.nextInt();

         if (start < 0 || end > s.length() || start >= end) {
            System.out.println("Invalid index");
            sc.close();
            return;
        }

        String Substring = "";
        for (int i = start; i < end; i++) {
            Substring += s.charAt(i);
        }

        String builtInSubstring = s.substring(start, end);
        boolean Equal = true;

        if (Substring.length() != builtInSubstring.length()) {
            Equal = false;
        } else {
            for (int i = 0; i < Substring.length(); i++) {
                if (Substring.charAt(i) != builtInSubstring.charAt(i)) {
                    Equal = false;
                    break;
                }
            }
        }
        System.out.println("Substring: " + Substring);
        System.out.println("Built-in Substring: " + builtInSubstring);
        System.out.println("Are both substrings equal: " + Equal);

        sc.close();


    }
    
}

    

