public class ReverseNegNumber {
    public static int ReverseNegative(int n){
        int digit=0;
        int rev=0;
        while(n!=0){
            digit=n%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE/10){ //handles integer overflow
                return 0;
            }
            rev=rev*10+digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num=-123;
        int n=1783;
        System.out.println(ReverseNegative(n));
        System.out.println(ReverseNegative(num));
    }
}
