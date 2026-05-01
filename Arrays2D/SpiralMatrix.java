package Arrays2D;

public class SpiralMatrix {
    /*
    path is: left to right
            top to bottom
            right to left
            bottom to top
     */
    public static void printSpiral(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=m-1;
        while(top<=bottom && left<=right){
            //left to right
            for(int i=left;i<=right;i++){
                System.out.print(mat[top][i]+" ");
            }
            top++;
            //top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;
            //right to left
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    System.out.print(mat[bottom][j]+" ");
                }
                bottom--;
            }
            //bottom to top
            if(left<=right){
                for(int j=bottom;j>=top;j--){
                    System.out.print(mat[j][left]+" ");
                }
                left++;
            }
        }
        
    }
    public static void main(String[] args) {
         int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printSpiral(matrix);
    }
}
