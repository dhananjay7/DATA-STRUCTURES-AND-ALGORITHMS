public class functionsL8 {
    public static boolean Isprime(int n ){
     if (n == 2 ){
        return true ;
     }
     for (int i = 2 ; i<=n ; i++){
        if (n % 1 == 0){
           return false;
        }
     }
     return true ;
    }
    public static void main (String args[]){
       System.out.println(Isprime(6));
    }
}
