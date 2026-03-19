import java.util.*;

public class RemoveDuplicate {
    //brute
    public static int[] removeDuplicates(int arr[]){
        //using set,order is not maintained
        Set<Integer>s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
           s.add(arr[i]);
        }
        int result[]=new int[s.size()];
        int j=0;
        for(int num:s){
            result[j]=num;
            j++;
        }
        return result;

    }
    //brute using LinkedHashedSet
    public static int [] removeDuplicates2(int arr[]){
         Set<Integer> set = new LinkedHashSet<>();
         for(int num:arr){
            set.add(num);
         }
         int res[]=new int[set.size()];
         int j=0;
         for(int k:set){
            res[j++]=k;
         }
         return res;
    }
    public static int[] removeDuplicates3(int[] arr) {
    Set<Integer> set = new TreeSet<>();

    for (int num : arr) {
        set.add(num);
    }

    int[] result = new int[set.size()];
    int i = 0;
    for (int num : set) {
        result[i++] = num;
    }
    return result;
}
    //optimised
    public static ArrayList<Integer>RemoveDuplicateElements(int arr[]){
        ArrayList<Integer>al=new ArrayList<>();
        Arrays.sort(arr);
        al.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                al.add(arr[i]);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int arr[]={1,7,2,3,1,3,2};
        System.out.println(RemoveDuplicateElements(arr));
        int res[]=removeDuplicates(arr);
        int res2[]=removeDuplicates2(arr);
        int res3[]=removeDuplicates3(arr);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
    }
}
