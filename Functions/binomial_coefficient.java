public class binomial_coefficient { //inefficient code since only one function can be used to calculate all the remaining values
   
     public static int Factorial(int n) {
        int f = 1 ;
         for (int i = 1 ; i <= n ; i++) {
            f = f * i ;
         }
         return f ;
    }

     public static int Factorials(int r) {
        int f = 1 ;
         for (int i = 1 ; i <= r ; i++) {
            f = f * i ;
         }
         return f ;
    }

     public static int Factorialss(int n, int r) {
        int f = 1 ;
         for (int i = 1 ; i <= n-r ; i++) {
            f = f * i ;
         }
         return f ;
    }

    public static int binomial_coefficients(){
               int binomial_coefficient = Factorial(5)/(Factorials(2)*Factorialss(5,2)) ;        
      return binomial_coefficient;
    }
    public static void main(String[] args) {
         
            System.out.println(binomial_coefficients());

    }
}
