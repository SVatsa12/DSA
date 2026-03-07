public class ReverseNumber {
    public static int reverse(int n){
        int digit=0;
        int rev=0;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n=384;
        System.out.println(reverse(n));
    }
}
