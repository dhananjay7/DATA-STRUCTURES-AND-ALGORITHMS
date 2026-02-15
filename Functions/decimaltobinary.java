public class decimaltobinary {
    public static void DeciTobin(int n){
        int MyDec = n ;
        int pow = 0 ;
           int Binary = 0 ;
           while (n > 0){
            int remainder = n % 2;

             Binary = Binary + (remainder * (int)Math.pow(10, pow)) ;
        pow ++;
        n = n / 2 ;

           }
           System.out.println("My decimal " + MyDec + " To binary is = " + Binary);

    }
    public static void main(String[] args) {
        DeciTobin(143);
    }
}