public class BinomialCoefficient {
    public static double factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static double calculateBinomial(int n,int r){
        double n_fact=factorial(n);
        double r_fact=factorial(r);
        double nminusr_fact=factorial(n-r);
        double binomialcoefficient=n_fact/(r_fact*nminusr_fact);
        return binomialcoefficient;
    }
    public static void main(String[] args) {
        System.out.println(calculateBinomial(5, 2));
    }
}
