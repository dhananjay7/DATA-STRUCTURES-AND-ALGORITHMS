public class functionsL6 {
    public static int fact(int n){
        int f = 1;
        for (int i = 1; i <= n ; i++){
            f = f * i;
        }
        return f ;
    }
    public static int BinnCoeff(int n,int r ){
           int fact_n = fact(n);
           int fact_r = fact(r);
           int fact_nmr = fact(n-r);

       int BinnCoeff = fact_n / (fact_r * fact_nmr);
       return BinnCoeff;
     
    }
    public static void main(String args[]){
    System.out.println(BinnCoeff(10, 5)); 
    }
}