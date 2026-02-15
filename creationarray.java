import java.util.*;
public class creationarray {
public static void main(String args[]){

    int marks[] = new int[10];

    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();

          System.out.println("The marks of 1 is " + marks[0]);
            System.out.println("The marks of 2 is " + marks[1]);
              System.out.println("The marks of 3 is " + marks[2]);

              marks[2] = marks[2] + 2 ;
              System.out.println("The marks of 3 is " + marks[2]);
              System.out.println("The length of array is = " + marks.length);

    sc.close();
}
}