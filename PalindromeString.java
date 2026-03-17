public class PalindromeString {
    public static boolean isPalindrome(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    // public static boolean isPalindromeLEETCODE(String s){
    //     int n=s.length();
    //     int i=0;
    //     int j=n-1;
    //     while(i<j){

    //     }
    // }
    public static void main(String[] args) {
        String str1="hello";
        String str2="madam";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
}
