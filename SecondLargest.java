import java.util.*;
public class SecondLargest {
    public static int Secondlargest(int arr[]){
        //brute
        int n=arr.length;
        Arrays.sort(arr);
        return arr[n-2];
    }
        public static int Secondlargest2(int arr[]){
        //brute
        int n=arr.length;
        int largest=Integer.MIN_VALUE;
        int sLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                sLargest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>sLargest){
                sLargest=arr[i];
            }
            
        }
        return sLargest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,9,7};
        int res=Secondlargest(arr);
        System.out.println(res);
        System.out.println(Secondlargest2(arr));

    }
}
