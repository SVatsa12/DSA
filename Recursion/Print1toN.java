package Recursion;

public class Print1toN {
    public static void Printfrom1(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i+" ");
        i++;
        Printfrom1(i,n);
    }
    public static void main(String[] args) {
        int i=1;
        int n=10;
        Printfrom1(i,n);
    }
}
