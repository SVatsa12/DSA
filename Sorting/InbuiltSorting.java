package Sorting;
import java.util.*;
public class InbuiltSorting {
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2};
        int arr2[]={5,1,3,4,2};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
        //using collections
        // Arrays.sort(arr,Collections.reverseOrder());
    }
}
