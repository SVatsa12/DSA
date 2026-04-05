package Hashing;
import java.util.*;
public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        //put method
        hm.put("Delhi", 1);
        hm.put("Mumbai", 2);
        hm.put("Hyderabad", 3);
        hm.put("Chennai", 4);
        System.out.println(hm);

        //get method
        System.out.println(hm.get("Chennai"));

        //size method
        System.out.println(hm.size());

        //containsKey method :returns boolean result
        System.out.println(hm.containsKey("Delhi"));
        System.out.println(hm.containsKey("Jammu"));

        hm.remove("Chennai");
        System.out.println(hm);

    }
}
