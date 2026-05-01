package STRINGS;
import java.util.*;
public class StringsDeclaration {
    public static void main(String[] args) {
        //Method 1:
        String str="Abcd";
        System.out.println(str);
        //Method 2:
        String str2=new String("Hello");
        System.out.println(str2);

        //Input
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a  word:");
        String name=sc.next();
        System.out.println(name);
        
        sc.close();
    }
}
