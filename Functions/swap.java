public class swap {
    public static void main(String args[]) {

        int a = 3;
        int b = 4;

        // swap : sabse pehle ek temporary variable banayege jisme a ki value store hogi
        // or fir a me b ki value store karege then finnaly temp ki value b me dal dege

        int temp = a;
        a = b;
        b = temp;

        System.out.println("The value of a is = " + a);
        System.out.println("The value of b is = " + b);
    }
}