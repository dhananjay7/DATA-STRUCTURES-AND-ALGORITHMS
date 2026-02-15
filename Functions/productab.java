public class productab {

     public static int calculate(int num1 , int num2 ){
       int mul = num1 * num2 ;
       return  mul ; 
      
    }
    public static void main(String args[]){
       int a = 3 ; 
       int b = 5 ; 
      int mul = calculate(a , b) ; //call ke waqt parameters me a and b ki value change kar sakte he 
       System.out.println("The mul is = "+ mul );
    }
}
