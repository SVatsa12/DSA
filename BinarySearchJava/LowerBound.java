package BinarySearchJava;
public class LowerBound {
    public static int Lowerbound(int arr[],int n, int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]>=x){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={3,5,8,15,19};
        int x=9;
        int res=Lowerbound(arr, arr.length, x);
        System.out.println(res);
    }
}
