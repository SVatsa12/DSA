
package Hashing;
import java.util.*;
public class LinkedHashMapIteration {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer>lhm=new LinkedHashMap<>();
        lhm.put("A",100);
        lhm.put("B",150);
        lhm.put("C",200);
        lhm.put("D",250);

        //Iteration using entrySet()
        for(Map.Entry<String,Integer> entry:lhm.entrySet()){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
        
        //using keySet()
        System.out.println("Iteration using Keyset()");
        for(String key:lhm.keySet()){
            System.out.println(key+"->"+lhm.get(key));
        }

    }
}
