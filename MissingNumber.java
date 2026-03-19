public class MissingNumber {
    //Type1 :arr[1,2,4,5]
    //output:3
    public static int MissingNum(int arr[]){
        int xor1=0;
        int xor2=0;
        for(int i=1;i<=arr.length+1;i++){
            xor1^=i;
        }
        for(int i=0;i<arr.length;i++){
            xor2^=arr[i];
        }
        return xor1^xor2;
    }

    //Type 2:arr[0,2,3,4]
    //output:1
    public static int MissingNum2(int arr[]){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<=arr.length;i++){
            xor1^=i;
        }
        for(int i=0;i<arr.length;i++){
            xor2^=arr[i];
        }
        return xor1^xor2;
    }
    //brute
    public static int MissingNum3(int arr[]){
        int sum=0;
        int currsum=0;
        for(int i=0;i<=arr.length;i++){
            sum+=i;
        }
        for(int i=0;i<arr.length;i++){
            currsum+=arr[i];
        }
        int res=sum-currsum;
        return res;
    }
    //brute
    public static int MissingNumUniversal(int arr[]) {
    int n = arr.length;

    boolean hasZero = false;

    // Check if 0 exists
    for (int num : arr) {
        if (num == 0) {
            hasZero = true;
            break;
        }
    }

    int expectedSum = 0;

    if (hasZero) {
        // Case: 0 to n
        for (int i = 0; i <= n; i++) {
            expectedSum += i;
        }
    } else {
        // Case: 1 to n+1
        for (int i = 1; i <= n + 1; i++) {
            expectedSum += i;
        }
    }

    int actualSum = 0;
    for (int num : arr) {
        actualSum += num;
    }

    return expectedSum - actualSum;
}
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int arr2[]={0,1,3,5,4};
        int res1=MissingNum(arr);
        int res2=MissingNum2(arr2);
        int res3=MissingNum3(arr2);
        int res4=MissingNum3(arr);
        int res5=MissingNumUniversal(arr);
        int res6=MissingNumUniversal(arr2);
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
        System.out.println(res5);
        System.out.println(res6);
    }
}
