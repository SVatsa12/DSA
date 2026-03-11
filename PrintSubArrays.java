public class PrintSubArrays {
    public static void PrintSubarrays(int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                }
                cnt++;
                System.out.println();
            }
        }
        System.out.println("Total subarrays:"+cnt);
    }
public static void PrintSubarrays2(int arr[]) {
    int cnt=0;
    for (int i = 0; i < arr.length; i++) {
        String subarray = "";
        for (int j = i; j < arr.length; j++) {
            subarray += arr[j] + " ";
             cnt++;
            System.out.println(subarray.trim());
           
        }
    }
    System.out.println("Total subarrays:"+cnt);
}
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        PrintSubarrays(arr);
        PrintSubarrays2(arr);
    }
}
