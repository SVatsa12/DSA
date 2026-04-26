package Hashing;
import java.util.*;
public class LinkedHashMapImplementation {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Integer>lhm=new LinkedHashMap<>();
        lhm.put(1,50);
        lhm.put(2,100);
        lhm.put(3,150);
        lhm.put(4,200);
        lhm.put(5,250);
        System.out.println(lhm);
        lhm.remove(4);
        System.out.println(lhm);
       System.out.println(lhm.get(2)); 
       

    }
}
