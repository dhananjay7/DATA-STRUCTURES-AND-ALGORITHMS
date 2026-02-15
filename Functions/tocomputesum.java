public class tocomputesum {

    public static int Sum(int n) {
        int sum = 0;
        while (n > 0 ){
        int lastdigit = n % 10;
        sum = sum + lastdigit;
        n = n / 10;
        }
        return sum ; 
    }
    public static void main(String args[]) {
            System.out.println(Sum(8033636));
    }
}