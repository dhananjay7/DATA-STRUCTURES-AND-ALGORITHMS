import java.util.*;

public class parameters {

    public static int calculate(int num1, int num2) // parameters or formal parameters kaam ate he function definition ke waqt
    {
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calculate(a, b); // arguments or actual parameters kaam ate he function call ke waqt
        System.out.println("the sum is = " + sum);
        sc.close();
    }
}