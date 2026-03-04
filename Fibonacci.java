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
      for(int i=2;i<=n;i++){
            int res=f0+f1;
            f0=f1;
            f1=res;

        }
        System.out.println(f1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        fibUsingWhileLoop(n);
        fibUsingForLoop(n);
        sc.close();
    }
}
