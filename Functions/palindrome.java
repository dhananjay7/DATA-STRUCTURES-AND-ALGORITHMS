public class palindrome {
    public static boolean isSame(int n){
           int reverse = 0; ;

           while (n > 0){
               int lastdigit = n % 10 ;
               reverse = reverse + ( lastdigit * 10 );
               n = n / 10 ;
              if (reverse == n){
                return true ;
              }
           }
           return false ;

    }
    public static void main(String[] args) {
        System.out.println(isSame(121));
    }
}
