package Arrays2D;

public class DiagonalSum {
    public static int Diagonalsum(int mat[][]){
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i];
        }
        return sum;
    }

    // this gives:primary+secondary
    public static int Diagonalsum2(int mat[][]){
        int n=mat.length;
        int m=mat[0].length;
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                //primary diagonal
                if(i==j){
                    sum+=mat[i][j];
                }
                //secondary diagonal
                else if(i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    //that gives:primary+diagonal
    public static int Diagonalsum3(int mat[][]){
        int sum=0;
        for(int i=0;i<mat.length;i++){
            //primary diagonal
            sum+=mat[i][i];

            //secondary diagonal
            if(i!=mat.length-i-1){
                sum+=mat[i][mat.length-i-1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int res=Diagonalsum(matrix);
        System.out.println(res);
        int res2=Diagonalsum2(matrix);
        System.out.println(res2);
        int res3=Diagonalsum2(matrix);
        System.out.println(res3);
    }
}
