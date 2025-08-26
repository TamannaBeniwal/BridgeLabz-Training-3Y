package StringLevel1;

import java.util.Scanner;
public class stringindexoutofbounds {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string: ");
        String s=sc.next();
        try{
            System.out.println("access invalid index: ");
            System.out.println("character at position 10: "+s.charAt(10));
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("caught stringindexoutofbound exception");
            System.out.println("error message: " + e.getMessage());
        }
        sc.close();


        

    }
    
}