package Arrays2D;

public class TransposeOfMatrix {
    //for square matrix only
    public static void Transpose(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.println("Square Matrix Transpose:");
        for(int i=0;i<n;i++){
            for(int j=i;j<m;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    //for unequal rows and columns
        public static int[][] Transpose2(int matrix[][]){
        int n=matrix.length;
        int m=matrix[0].length;
        int transpose[][]=new int[m][n];
        System.out.println("Rectangular Matrix Transpose:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                transpose[j][i]=matrix[i][j];
            }
        }
        return transpose;
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3,10},{4,5,6,11},{7,8,9,12}};
        Transpose(arr);
        int n=arr.length;
        int m=arr[0].length;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int result[][]=Transpose2(arr2);
        for(int i=0;i<result.length;i++){
            for(int j=0;j<result[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
