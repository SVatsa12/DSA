package Recursion;

public class ReverseusingRecursion {
    public static void Reverse(int arr[],int n){
        if(n<=arr.length/2){
            return;
        }
        int left=arr.length-n;
        int right=arr.length-left-1;
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        Reverse(arr,n-1);

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Reverse(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
