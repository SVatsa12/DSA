package BinarySearchJava;


//This doesn't handle duplicates
public class SearchInRotatedArray {
    public  static int SearchRotated(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]==target){
                return mid;
            
            //if left half is sorted,search in the left part of array
            }else if(arr[low]<arr[mid]){
                if(arr[low]<=target && target<=arr[mid]){
                    high=mid-1;
                }else{
                low=mid+1;
            }

            }
            //if right half is sorted,search in the right part of array
            else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={4, 5, 6, 7, 0, 1, 2};
        int target=1;
        int res=SearchRotated(arr, target);
        System.out.println(res);
    }
}
