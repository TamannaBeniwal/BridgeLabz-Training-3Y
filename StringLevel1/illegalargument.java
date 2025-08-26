package StringLevel1;

import java.util.Scanner;
public class illegalargument {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter a string: ");
        String s=sc.next();
        try{
            System.out.println("handling exception: ");
            String sub=s.substring(5,2);
            System.out.println("substring: "+sub);
        
        }
        catch(IllegalArgumentException e){
            System.out.println("caught exception: ");
            System.out.println("error message: "+e.getMessage());
               }
               catch(RuntimeException e){
                System.out.println("caught exception: ");
                System.out.println("error message: "+e.getMessage());

               }
               sc.close();

    }
    
}

