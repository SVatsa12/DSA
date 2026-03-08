public class PrintPrime {
    public static boolean PrimeNumber(int n){
        boolean isPrime=true;
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static  void PrintPrimes(int n){
        for(int i=2;i<=n;i++){
            if(PrimeNumber(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        // System.out.println(PrimeNumber(9));
        PrintPrimes(8);
    }
}
