import java.util.ArrayList;

public class RemoveDuplicate {
    public static ArrayList<Integer>RemoveDuplicateElements(int arr[]){
        ArrayList<Integer>al=new ArrayList<>();
        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                al.add(arr[i]);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1,3,2};
        System.out.println(RemoveDuplicateElements(arr));
    }
}
