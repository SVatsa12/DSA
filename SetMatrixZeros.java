public class SetMatrixZeros {
    //brute
    public static void SetMatrixZero(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    for(int col=0;col<n;col++){
                        if(matrix[i][col]!=0){
                            matrix[i][col]=-1;
                        }
                    }
                    for(int row=0;row<m;row++){
                        if(matrix[row][j]!=0)
                            matrix[row][j]=-1;
                    }
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==-1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    //better
    public static void SetMatrixZero2(int matrix[][]){
        int m=matrix.length;
        int n=matrix[0].length;
        boolean zeroRows[]=new boolean[m];
        boolean zeroCols[]=new boolean[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    zeroRows[i]=true;
                    zeroCols[j]=true;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(zeroRows[i] || zeroCols[j] ){
                    matrix[i][j]=0;
                }
            }
        }
    }
    //optimal
    public static void setMatrixZero3(int [][]matrix){
        int m=matrix.length;
        int n=matrix[0].length;
        boolean firstRowZero=false;
        boolean firstColZero=false;
        //check first row
        for(int j=0;j<n;j++){
            if(matrix[0][j]==0){
                firstRowZero=true;
                break;
            }
        }
        //check first col
        for(int i=0;i<m;i++){
            if(matrix[i][0]==0){
                firstColZero=true;
                break;
            }
        }
        //use first row and columns as markers
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;   //mark row
                    matrix[0][j]=0;  //mark column
                }
            }
        }
        //set zeros  based on marker
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        //zero the first col if need
        if(firstColZero){
            for(int i=0;i<m;i++){
                matrix[i][0]=0;
            }
        }
        if(firstRowZero){
            for(int j=0;j<n;j++){
                matrix[0][j]=0;
            }
        }

    }
    public static void main(String[] args) {
       int matrix[][] = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    int matrix2[][] = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };
    int matrix3[][] = {
        {1, 1, 1},
        {1, 0, 1},
        {1, 1, 1}
    };


    SetMatrixZero(matrix);
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
        SetMatrixZero2(matrix2);
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
            setMatrixZero3(matrix3);
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    }
}
