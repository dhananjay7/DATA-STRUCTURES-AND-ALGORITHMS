//find factorial
public class functionsL5 {
    public static int Fact(int a){
      int f = 1;
      int n = a ;
      for (int i= 1 ; i <= n ;i ++ ){
       f = f * i ;
     
      }
        System.out.println(f);
        return f;
    }
    public static void main(String[] args) {
        int a = 4;
        Fact(a);
    }
}
