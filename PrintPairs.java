public class PrintPairs {
    public static void printPairs(int arr[]){
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int curr=arr[0];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+arr[j]+")");
                cnt++;
            }
            System.out.println();
        }
         System.out.println("Total Pairs:"+cnt);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        printPairs(arr);
    }
}