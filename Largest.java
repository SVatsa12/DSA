import java.util.*;
public class Largest {
    //Brute force
    public static int LargestElement(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-1];
    }
    //Optimised
    public static int LargestElement2(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
           
        }
     return largest;
    }
    public static void main(String[] args) {
        int n[]={3,4,7,1,2};
        int res=LargestElement(n);
        System.out.println("Largest:"+res);
        System.out.println("Largest:"+LargestElement2(n));
    }
}
