package Arrays2D;

public class Sumof2ndRowofMatrix {
    public static int Sumof2ndRow(int mat[][]){
        int n=mat.length;

        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[1][i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int res=Sumof2ndRow(arr1);
        System.out.println(res);
    }
}
