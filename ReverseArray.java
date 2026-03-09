public class ReverseArray {
    public static void Reverse1(int arr[]){
        for(int i=arr.length;i>0;i--){
            System.out.println(i);
        }
    }
    public static void Reverse2(int arr[]){
        int first=0;
        int last=arr.length-1;
        while(first<last){
            int temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Reverse1(arr);
        Reverse2(arr);
        for(int k:arr){
            System.out.print(k+" ");
        }
    }
}
