package BinarySearchJava;
//This handles duplicates
public class SearchInRotatedArray2 {
    public static boolean SearchRotated(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return true;
            }

            //handling duplicates
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low++;
                high--;
                continue;
            }else if(arr[low]<arr[mid]){
                if(arr[low]<=target && target<=arr[high]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(arr[mid]<=target && target<=arr[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={7, 8, 1, 2, 3, 3, 3, 4, 5, 6};
        int target=3;
        boolean res=SearchRotated(arr, target);
        System.out.println(res);
    }
}
