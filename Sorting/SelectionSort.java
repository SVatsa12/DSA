package Sorting;

public class SelectionSort {
    public static void Selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<=n-1;i++){
            int minIdx=i;
            for(int j=i+1;j<=n-1;j++){
                if(arr[minIdx]>arr[j]){
                    minIdx=j;
                }
                
            }
            //perform swapping
                int temp=arr[minIdx];
                arr[minIdx]=arr[i];
                arr[i]=temp;
        }

    }
    public static void main(String[] args) {
        int arr[]={5,1,4,3,2};
        Selectionsort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
