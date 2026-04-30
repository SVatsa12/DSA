import java.util.*;
public class LeaderInAnArray {
    public static void Leader(int arr[]){
        int n=arr.length;
        int leader=arr[n-1];
        //always check from left
        ArrayList<Integer>al=new ArrayList<>();
        al.add(leader);
        for(int i=n-2;i>=0;i--){
            if(arr[i]>=leader){
                al.add(arr[i]);
                leader=arr[i];
            }
        }
          // reverse to maintain original order
        Collections.reverse(al);
        for(int i:al){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[]={16,12,4,3,9,2};
        Leader(arr);
    }
}
