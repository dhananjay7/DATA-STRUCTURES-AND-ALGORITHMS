public class Functionoverloading {

    public static int sum(int a , int b){
       return a + b ; 

    }

    public static int sum(int a , int b , int c) // parameters more than previously made method 
    { 
        return a + b + c ; 

    }
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(2,4,5));
    }
}
