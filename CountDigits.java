public class CountDigits {
    public static int countdigits(int n){
        int digits=0;
        int count=0;
        while(n!=0){   //To take care of negative numbers we need to put n!=0 instead of n>0
            digits=n%10;
            count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int num=371;
        int x=countdigits(num);
        System.out.println(x);
        int num2=-1201;
        System.out.println(countdigits(num2));
    }
}
