public class optimisedprimeornot {
    
    public static boolean isPrime(int n){
        //special cases 
        //for 2 
        if (n == 2){
            return true ;
        }
        else {
        for (int i = 2; i<= Math.sqrt(n) ; i++) // Math.sqrt used for efficieny
        {
            if (n % i == 0){ //completely divide 
                return false ;
            }
        }
        return true ;
    }
}
    public static void main(String[] args) {
        System.out.println(isPrime(6803470));
    }
}
