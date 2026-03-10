package Recursion;
//Print GFG n times without the loop.
public class PrintNames {
    public static void printName(int n){
   //base condition
   if(n<=0){
        return;
   }
   System.out.print("GFG"+" ");
   n--;
   printName(n);
   }
    public static void main(String[] args) {
        int n=5;
        printName(n);
    }
}
