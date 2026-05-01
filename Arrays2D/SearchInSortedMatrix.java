package Arrays2D;

public class SearchInSortedMatrix {
    public static boolean SearchMatrix(int mat[][],int target){
        int row=0;
        int col=mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]==target){
                return true;
            }else if(target<mat[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{4,5,6},{7,8,9}};
        int target1=9;
        System.out.println(SearchMatrix(matrix, target1));
        int target2=10;
        System.out.println(SearchMatrix(matrix, target2));
    }
    
}
