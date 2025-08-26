package level1;
import java.util.Scanner;
public class CompareString {
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        System.out.println("enter string s1:"+s1);
        

        String s2=sc.next();
        System.out.println("enter string s2: "+s2);
//using chaAt method

        boolean charAtComparison = true;
        if (s1.length() != s2.length()) {
            charAtComparison = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    charAtComparison = false;
                    break;
                }
            }
        }
  //using equals      
        boolean equalsComparison = s1.equals(s2);
        System.out.println("compare using charAt: "+charAtComparison);
        System.out.println("compare using equals: "+equalsComparison);

//when results are same
         if (charAtComparison == equalsComparison) {
            System.out.println("gave the same result");
        } else {
            System.out.println("gave different results");
        }
        sc.close();
    }
    
}

    

