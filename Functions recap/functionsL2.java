//sum of 2 numbers using parameters 

import java.util.Scanner;
public class functionsL2 {
    public static int SumofIntegers(int a , int b ){

      int sum = a + b ; 
      System.out.println("the sum is = " + sum);
        return sum;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter num 1 = ");
      int a = sc.nextInt();
      System.out.print("Enter num 2 = ");
      int b = sc.nextInt();

      SumofIntegers(a,b); 
     sc.close();
    }
}