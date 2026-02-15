//call by value 
public class functionsL4 {

    public static void Swap(int a , int b){
        int temp = a;
        a = b; 
        b = temp ;
        System.out.println("a is" + a +"b is "+ b);
        return;
    }
    public static void main(String args[]){
int a = 5;
int b = 4;
Swap(a, b);
    }
}
