package BinarySearchJava;

import java.util.Arrays;

//floor and ceil in a sorted array
public class FloorandCeil {
    public static int [] getFloorandCeil(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int floor=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=x){
                floor=arr[mid];
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        low=0;
        high=arr.length-1;
        int ceil=-1;
        while(low<=high){
           int mid=low+(high-low)/2;
           if(arr[mid]>=x){
            ceil=arr[mid];
            high=mid-1;
           }else{
            low=mid+1;
           }
        }
        return new int[]{floor,ceil};
    }
    public static void main(String[] args) {
        int  arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int x=7;
        int res[]=getFloorandCeil(arr, x);
        System.out.println(Arrays.toString(res));
    }
}
