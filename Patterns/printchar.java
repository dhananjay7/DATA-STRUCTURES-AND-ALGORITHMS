public class printchar {
    public static void main(String args[]) {
        int n = 4 ;
        char ch = 'A' ;
        for (int line = 1; line <= n; line++) {
            for (int Chars = 1; Chars <= line; Chars++) {
                System.err.print(ch);
                ch ++ ;
            }
            System.out.println();
        }
    }
}