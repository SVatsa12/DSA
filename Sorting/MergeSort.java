package Sorting;

public class MergeSort {
    public static void merge(int arr[],int start,int mid,int end){
        int []temp=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid &&  j<=end){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){    
                temp[k]=arr[i];
                k++;
                i++;   
        }
        while(j<=end){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(k=0,j=start;k<temp.length;k++,j++){
            arr[j]=temp[k];
        }
    }
    public static void mergesort(int arr[],int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergesort(arr,start,mid);
            mergesort(arr, mid+1, end);
            merge(arr, start, mid, end);
        }
    }
    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,9,1,6,4};
        mergesort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
