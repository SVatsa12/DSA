package Arrays2D;

public class SumofMatrix {
    public static int [][] sum(int mat1[][],int mat2[][]){
        int n1=mat1.length;
        int m1=mat1[0].length;
        int sum[][]=new int[n1][m1];
        int n2=mat2.length;
        int m2=mat2[0].length;
        if(n1==n2 && m1==m2){
           for(int i=0;i<n1;i++){
            for(int j=0;j<m1;j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
            }
           }
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{10,11,12},{13,14,15},{16,17,18}};
        int res[][]=sum(arr1, arr2);
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
