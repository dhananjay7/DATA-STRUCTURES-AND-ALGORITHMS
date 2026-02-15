//product of 2 integers 
public class functionsL3 {

    public static int ProductofIntegers(int num1 , int num2){
        
        int mul = num1 * num2;
        return mul ;
    }
    public static void main (String args[]){
       int a = 3 ;
       int b = 5 ;
       int prod = ProductofIntegers(a, b);
       System.out.println("a * b is = "+ prod);
       prod = ProductofIntegers(20,30);
       System.out.println("a * b is = "+ prod);
    }
}
