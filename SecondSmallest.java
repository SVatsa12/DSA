public class SecondSmallest {
    public static int Secondsmallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        int sSmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                sSmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]>smallest && arr[i]<sSmallest){
                sSmallest=arr[i];
            }
        }
        return sSmallest;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,7};
        System.out.println(Secondsmallest(arr));
    }
}
