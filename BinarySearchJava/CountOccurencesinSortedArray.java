package BinarySearchJava;
//occurences=lastoccurence-firstoccurence+1
public class CountOccurencesinSortedArray {
    public static int countOccurences(int arr[],int target){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        //calculate first occurence
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=mid-1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        //calculate last occurence
        low=0;
        high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }else if(arr[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(first==-1)return 0;
        return last-first+1;
    }
    public static void main(String[] args) {
        int arr[]={2, 2 , 3 , 3 , 3 , 3 , 4};
        int target=3;
        int res=countOccurences(arr, target);
        System.out.println(res);
    }
}
