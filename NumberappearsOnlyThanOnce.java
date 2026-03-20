public class NumberappearsOnlyThanOnce {
    //brute approach
    public static int SingleNumber2(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            int nums=arr[i];
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==nums){
                    cnt++;
                }
            }
            if(cnt==1){
                return nums;
            }
        }
        return -1;
    }

    //Optimised code
    //This question is also known as Single Number in Leetcode
    public static int SingleNumber1(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,3,3,4,4};
        int res=SingleNumber1(arr);
        int res2=SingleNumber2(arr);
        System.out.println(res);
        System.out.println(res2);
        
    }
}
