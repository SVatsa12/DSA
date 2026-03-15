import java.util.Arrays;

public class RotateArrayby1 {
    public static void RotateLeft(int arr[]){
        //store first element
        int first=arr[0];

        //shifting
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        //handle last element
        arr[arr.length-1]=first;
    }
    public static void RotateRight(int arr[]){
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
    }
    public static void main(String[] args) {
                int arr[] = {1,2,3,4,5};

        RotateLeft(arr);

        System.out.println(Arrays.toString(arr));
         int arr2[] = {1,2,3,4,5};

        RotateRight(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
