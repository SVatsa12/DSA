
import java.util.Arrays;

public class MoveZerostoEnd {
    //brute
    public static void MoveZeros2(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[n-1]=arr[0];
                i--;
                n--;
            }
        }
    }

    public static void MoveZeros(int arr[]){
        int idx=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx]=arr[i];
                idx++;
            }
        }
            while(idx<arr.length){
                arr[idx]=0;
                idx++;
            }
    }
    //optimised code
    public static void MoveZeros3(int arr[]){
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            }
        }

    }
    public static void main(String[] args) {
        int arr[]={ 1, 2, 0, 4, 3, 0, 5, 0};
        int arr2[]={ 1, 2, 0, 4, 3, 0, 5, 0,9};
        int arr3[]={ 1, 2, 0, 4, 3, 0, 5, 0,7};
        MoveZeros(arr);
        MoveZeros(arr2);
        MoveZeros3(arr3);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
