package BinarySearchJava;

import java.util.Arrays;

public class FirstandLastOccurence {
    public static int [] FirstandLast(int arr[],int target){
        //for first occurence
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //first occurence mei check towards left
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        //last occurence
        low=0;
        high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //last occurence mei check towards right
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,8,8,10};
        int target=8;
        int res[]=FirstandLast(arr,target);
        System.out.println(Arrays.toString(res));
    }
}
