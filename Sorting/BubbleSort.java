package Sorting;

public class BubbleSort {
    public  static void Bubblesort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={4,5,1,3,2};
        Bubblesort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }
}
