import java.util.*;
public class ArithmeticOperators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        int subs=a-b;
        int product=a*b;
        int division=a/b;
        int modulo=a%b;
        System.out.println("Sum:"+sum);
        System.out.println("Substraction:"+subs);
        System.out.println("Product:"+product);
        System.out.println("Division:"+division);
        System.out.println("Modulus:"+modulo);


        //Unary operators
    //Pre increment
        int x=10;
        int y=++x;
        System.out.println(x);
        System.out.println(y);
        int z=10;
        int p=z++;
        System.out.println(z);
        System.out.println(p);
        int x1=10;
        int y1=--x1;
        System.out.println(x1);
        System.out.println(y1);
        int x2=10;
        int y2=x2--;
        System.out.println(x2);
        System.out.println(y2);
        sc.close();
    } 
}

