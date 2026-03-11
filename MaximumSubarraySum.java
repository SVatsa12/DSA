public class MaximumSubarraySum {
    public static void MaxSubarraySum(int arr[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=arr[k];
                }
                maxSum=Math.max(maxSum, currSum);
            }
        }
        
        System.out.println("Max sum:"+maxSum);
    }
    public static int MaximumSubarraySum2(int arr[]){
        int currSum=arr[0];
        int maxSum=arr[0];
        if(arr.length==1){
            return arr[0];
        }
        for(int i=0;i<arr.length;i++){
            currSum=Math.max(arr[i],currSum+arr[i]);
            maxSum=Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        MaxSubarraySum(arr);
        int x=MaximumSubarraySum2(arr);
        System.out.println(x);
    }
}
