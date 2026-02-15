public class evenodd {

    public static boolean isEven(int n){
       if (n % 2 == 0)  //to optimixe this code you can just write (return n % 2 == 0 ;) this will give the same answer regardingly 
       {
        return true;
       }
return false; 
    }
    public static void main(String[] args) {
       System.out.println(isEven(7)); 
    }
}