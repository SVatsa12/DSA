package BinarySearchJava;
/*Think of the rotated sorted array as two sorted halves the rotation “break” point is
 where the smallest element lives. Using binary search, we can efficiently zoom in on
  this smallest element by comparing middle elements to the rightmost element. 
  If the middle element is greater than the rightmost element, the rotation point is
   to the right. Otherwise, it's to the left or could be the middle itself. 
   This way, we reduce the search space by half each time, 
   getting the rotation count in O(log n).
 */
public class NumberOfTimesArrayIsRotated {
    public static int findRotations(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int res=findRotations(arr);
        System.out.println(res);
    }
}
