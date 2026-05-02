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
        
        // FIX: consume leftover newline
        sc.nextLine();


        //Input 2
        
        System.out.println("Enter a long Sentence:");
        String name2=sc.nextLine();
        System.out.println(name2);


        //String length
        String str4="Tony Stark";
        System.out.println(str4.length());


        //String Concatenation
        String firstname="Raj";
        String secondname="Kumar";
        String fullname=firstname+secondname;
        System.out.println(fullname);


        //charAt()
        String str5="Hellllooo";
        System.out.println(str5.charAt(4));



        String str6="Tony";
        String str7="Tony";
        String str8=new String("Tony");
        if(str6==str7){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
        //will give Not equal as output because str8 is created as a new object with different memory allocation
        if(str6==str8){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }


        //equals():returns true if 2 strings are same(irrespective of the way of creation)
        if(str6.equals(str8)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equals");
        }

        if(str6.equals(str7)){
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }


        //substring(in built)
        String str9="We play hockey";
        System.out.println(str9.substring(9));
        System.out.println(str9.substring(2,12));


        //compareTo: returns 0 if both strings are equal, negative if string1<string2 and positive if string1>string2
        System.out.println(str6.compareTo(str7));
        String str10="Hockey";
        String str11="Hell";
        String str12="Helllllooo2234567uiop";
        System.out.println(str10.compareTo(str11));
        System.out.println(str10.compareTo(str12));
        sc.close();
    }
}
