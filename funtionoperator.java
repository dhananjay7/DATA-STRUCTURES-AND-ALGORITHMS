public class funtionoperator {
    public static void Update(int Marks[]) {
        for (int i = 0; i < Marks.length; i++) {
            Marks[i] = Marks[i] + 1;
        }
    }
    public static void main(String args[]) {
        int Marks[] = { 5, 6, 7 };
        Update(Marks);

        for (int i = 0; i < Marks.length; i++) {
            System.out.print(Marks[i] + " ");
        }
        System.out.println();
    }
}
