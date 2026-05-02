package STRINGS;

public class PrintEachCharInString {
    public static void printEachChar(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="Kingdom";
        printEachChar(str);
    }
}
