package Arrays2D;

public class FrequencyofNumberIn2DArray {
    public static int CountFrequency(int mat[][],int target){
        int count=0;
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==target){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][]={{4,7,8},{8,8,7}};
        int num=7;
        int res=CountFrequency(arr, num);
        System.out.println(res);
    }
}
