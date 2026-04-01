public class RotateImageClockWise {
    //brute
    public static void rotate(int [][]matrix){
        int n=matrix.length;
        int rotated[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rotated[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=rotated[i][j];
            }
        }
    }
    //optimal
    public static void rotate2(int [][]matrix){
        int n=matrix.length;
        //step1:swapping
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //step2:reversing
        for(int i=0;i<n;i++){
            int left=0,right=n-1;
            while(left<right){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;
                right--;
                left++;
            }

        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        rotate2(arr2);
        int n2=arr.length;
        for(int i=0;i<n2;i++){
            for(int j=0;j<n2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
