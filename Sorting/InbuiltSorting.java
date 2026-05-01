package Sorting;
import java.util.*;
public class InbuiltSorting {
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2};
        int arr3[]={5,1,2,9,3};
        Arrays.sort(arr3,0,5);
        for(int i:arr3){
            System.out.print(i+" ");
        }
        Arrays.sort(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
        System.out.println();
        //This works only in Objects
        Integer arr2[] = {5, 1, 3, 4, 2};
        Arrays.sort(arr2,Collections.reverseOrder());
        for(int i:arr2){
            System.out.print(i+" ");
        }
        Integer arr4[]={1,9,3,8,0};
        Arrays.sort(arr4,0,4,Collections.reverseOrder());
        for(int k:arr4){
            System.out.print(k+" ");
        }
    }
}
