package Hashing;
import java.util.*;
public class IterationHashMap {
    public static void main(String[] args) {
         HashMap<String,Integer>hm=new HashMap<>();
        hm.put("Bengalore",9);
        hm.put("Delhi", 1);
        hm.put("Mumbai", 2);
        hm.put("Hyderabad", 3);
        hm.put("Chennai", 4);

        //Iteration on HashMap:gives keys as output
        Set<String>key=hm.keySet();
        System.out.println(key);

        //printing values using keys using foreach loop
        for(String k:key){
            System.out.println(hm.get(k));
        }
        //entryset:returns both keys and values
        System.out.println(hm.entrySet());
    }
}
