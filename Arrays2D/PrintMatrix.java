package Arrays2D;
import java.util.*;
public class PrintMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and number of columns:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        // int n=matrix.length;
        // int m=matrix[0].length;

        System.out.println("Enter the matrix values:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+"    ");
            }
            System.out.println();
        }



        sc.close();

    }
}
