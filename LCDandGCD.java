import java.util.Arrays;

public class LCDandGCD {
    public static int[] calculateLCMandGCD(int a,int b){
        int x=a , y=b;
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        int gcd=x;
        int lcm=(a*b)/gcd;
        return new int[]{lcm,gcd};
    }

    public static void main(String[] args) {
        int a=5,b=10;
        int res[]=calculateLCMandGCD(a, b);

        System.out.println("LCM = " + res[0]);
        System.out.println("GCD = " + res[1]);
        System.out.println(Arrays.toString(calculateLCMandGCD(5,10)));
    }
}