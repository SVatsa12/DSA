

import java.util.Arrays;

public class RotateArraybyKPlaces {  
    public static void reverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotateLeft(int arr[], int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }
    public static void rotateRight(int arr[],int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
    //brute force approach
public static void rotateLeft2(int arr[],int k){
    for(int j=0;j<k;j++){
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
    }
}
//brute force approach
public static void rotateRight2(int arr[],int k){
    int n=arr.length;
    for(int j=0;j<k;j++){
        int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
}
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int arr2[] = {1,2,3,4,5,6,7};
        int arr3[] = {1,2,3,4,5,6,7};
        int arr4[] = {1,2,3,4,5,6,7};
        int k = 2;

        rotateLeft(arr, k);

        System.out.println(Arrays.toString(arr));
        rotateRight(arr2, k);
        System.out.println(Arrays.toString(arr2));
        rotateLeft2(arr3, k);
        System.out.println(Arrays.toString(arr3));
        rotateRight2(arr4, k);
        System.out.println(Arrays.toString(arr4));
    }
}
