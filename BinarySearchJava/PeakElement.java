package BinarySearchJava;
public class PeakElement {
    public static int peakElementInArray(int arr[]){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1]){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,5,1};
        int res=peakElementInArray(arr);
        System.out.println(res);
    }
}
