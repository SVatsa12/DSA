public class GCD {
    public static int calculateGCD(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static int calculateGCD2(int a,int b){
        int gcd=0;
        for(int i=1;i<=Math.min(a, b);i++){
            if(a%i==0 && b%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int a=10;
        int b=4;
        int res=calculateGCD(a, b);
        int res2=calculateGCD2(a, b);
        System.out.println(res);
        System.out.println(res2);
    }
}
