package BinarySearchJava;
//it should be a sorted array 
public class LastOccurence {
    public static int Lastoccurence(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
        }
    }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3, 4, 13, 13, 13, 20, 40};
        int target=13;
        int res=Lastoccurence(arr, target);
        System.out.println(res);
    }
}
