package STRINGS;
public class PalindromeString {
    public static boolean isPalindrome2(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
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
    public static boolean isPalindromeLEETCODE(String s){
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1="hello";
        String str2="madam";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
        System.out.println(isPalindrome2(str1));
        System.out.println(isPalindrome2(str2));
        System.out.println(isPalindromeLEETCODE(str1));
        System.out.println(isPalindromeLEETCODE(str2));
    }
}
