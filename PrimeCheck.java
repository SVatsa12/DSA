public class PrimeCheck {
    public static String IsPrime(int n){
        if(n<=1){
            return "Not Prime";
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return "Not Prime";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {
        System.out.println(IsPrime(2));
    }
}
