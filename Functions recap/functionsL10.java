public class functionsL10 {

    public static boolean Isprime(int n ){
        if( n == 2){
            return true ;
        }
        for(int i = 2 ; i <= Math.sqrt(n); i ++){
            if (n % i ==0 )
                {
                    return false ;
                }
        } 
        return true;
    }

    public static void PrimesInrange(int n){
        for (int i = 2 ; i <= n ; i ++){
            if (Isprime(i)){ //if ka matlbhe true hota he else me false hota he 
                System.out.println(i);
            }
            
        }
        return;
    }
    public static void main (String args[]){
     PrimesInrange(10);
    }
}
