import java.util.ArrayList;

public class IndexofSubarraySumGFG {   //TC:O(n^2)
    public static ArrayList<Integer> subarraysum (int arr[],int target){
        ArrayList<Integer>al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(target==sum){
                    al.add(i+1);
                    al.add(j+1);
                    return al;
                }
            }
        }
    al.add(-1);
    return al;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,7,5};
        int target=12;
        System.out.println(subarraysum(arr, target));
    }
}