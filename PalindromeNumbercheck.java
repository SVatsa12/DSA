public class PalindromeNumbercheck {
    public static boolean checkPalindrome(int n){
        int temp=n;
        int digit=0;
        int rev=0;
        if(n<0){
            return false;
        }
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkPalindrome(555));
        System.out.println(checkPalindrome(559));
    }
}
