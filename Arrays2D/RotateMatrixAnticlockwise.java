package Arrays2D;
public class RotateMatrixAnticlockwise {
    public static void rotateMatrix(int matrix[][]){
        int n=matrix.length;
        //step1:transpose
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //step2:Reverse column
        for(int j=0;j<n;j++){
            int left=0;
            int right=n-1;
            while (left<right) {
                int temp=matrix[left][j];
                matrix[left][j]=matrix[right][j];
                matrix[right][j]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int n=arr.length;
        rotateMatrix(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
