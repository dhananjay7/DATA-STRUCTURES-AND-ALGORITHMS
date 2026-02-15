public class sumofintegers {
    public static int sumofint(int n){
        int sumofintegers = 0 ;
        while(n > 0){
            int lastdigit = n % 10 ;
         sumofintegers = sumofintegers + lastdigit ;
         n = n / 10 ; 

        }
        System.out.println(sumofintegers);
        return sumofintegers ;
    }
    public static void main(String args[]){
       sumofint(44783); 
    }
}
