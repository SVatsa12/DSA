package Sorting;

public class QuickSort {
    public static int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high;j++){
            if(arr[j]<pivot){
                i++;
                //swap i with j
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        //swap pivot,(i+1 with high)
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        

        //return i+1
        return i+1;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pIndex=partition(arr,low,high);
            quickSort(arr, low, pIndex-1);
            quickSort(arr, pIndex+1, high);
        }
    }
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={3,1,6,2,9};
        quickSort(arr,0,arr.length-1);
        printArr(arr);
    }
}
