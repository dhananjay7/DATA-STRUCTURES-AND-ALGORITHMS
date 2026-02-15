public class palindromeornot {
    public static void palindrome(int n){
        int palindrome = n;
        int reverse = 0;
        while (n > 0){
            int lastdigit = n % 10;
             reverse = reverse* 10 + lastdigit ;
             n = n / 10 ;
    }
      if (palindrome == reverse){
            System.out.println("The number is palindrome");
            
        }else {
            System.out.println("The number is not palindrome");
           }
    }
    public static void main(String args[]){
         palindrome(122);
    }
}
