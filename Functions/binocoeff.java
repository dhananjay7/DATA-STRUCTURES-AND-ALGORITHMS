public class binocoeff {
     public static int Factorial(int n) //the n variable here is just for hatching the value and it doesnt affect what you put in it 
     { 
        int f = 1 ;
         for (int i = 1 ; i <= n ; i++) {
            f = f * i ;
         }
         return f ;
    }
        public static int bincoeff(int n , int r){
          int fact_n= Factorial(n);
            int fact_r = Factorial(r);
            int fact_nmr = Factorial(n-r);

            int bincoeff = fact_n/(fact_r*fact_nmr) ;
            return bincoeff;
        }
    public static void main(String[] args) {
        
      System.out.println(bincoeff(5, 2));

    }
}
