package Recursion;

public class Fibonacci {
    public static int fib(int n){
        if(n==0){
            return 1;
        }
        return n*fib(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        int res=fib(n);
        System.out.println(res);

    }
}
