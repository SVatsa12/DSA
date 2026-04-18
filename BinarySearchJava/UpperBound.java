package BinarySearchJava;

public class UpperBound {
    public static int Upperbound(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {3,5,8,9,15,19}, x = 9;
        int res=Upperbound(arr, x);
        System.out.println(res);
    }
}
