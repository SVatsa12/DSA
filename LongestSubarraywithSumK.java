public class LongestSubarraywithSumK{
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
public static void main(String[] args) {
    int arr[]={10, 5, 2, 7, 1, -10};
    int k=15;
    int res=LongestSubarraywithSum(arr, k);
    System.out.println(res);
}
}
