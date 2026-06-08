import java.util.*;
public class Fibonacci {
    public static void fibUsingWhileLoop(int n){
        int f0=0;
        int f1=1;
        while(n>1){
            int res=f0+f1;
            f0=f1;
            f1=res;
            n--;
        }
        System.out.println(f1);
    }
    public static void fibUsingForLoop(int n){
        int f0=0;
        int f1=1;
      for(int i=0;i<=n;i++){
            System.out.print(f0+" ");
            int res=f0+f1;
            f0=f1;
            f1=res;

        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        fibUsingWhileLoop(n);
        fibUsingForLoop(n);
        sc.close();
    }
}
