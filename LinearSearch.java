public class LinearSearch {
    public static int Linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,8,4};
        int key1=8;
        int key2=9;
        System.out.println("Element found at index:"+Linearsearch(arr, key1));
        System.out.println("Element found at index:"+Linearsearch(arr, key2));
        
    }
}
