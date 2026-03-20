import java.util.HashMap;

public class LongestSubarraywithSumK{
    //brute
    public static int LongestSubarraywithSum(int arr[],int K){
        int maxlen=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==K){
                    maxlen=Math.max(maxlen,j-i+1);
                }
            }
        }
        return maxlen;
    }

    //optimised
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum == k){
                maxLen = i + 1;
            }
            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxLen;
    }
public static void main(String[] args) {
    int arr[]={10, 5, 2, 7, 1, -10};
    int k=15;
    int res=LongestSubarraywithSum(arr, k);
    System.out.println(res);
    int res2=longestSubarray(arr, k);
    System.out.println(res2);
}
}
