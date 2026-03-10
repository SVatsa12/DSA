package Recursion;

public class Print1toNmethod2 {
    public static void Print(int n){
        if(n<=0){
            return;
        }
        Print(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Print(10);
    }
}
