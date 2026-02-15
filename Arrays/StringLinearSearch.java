public class StringLinearSearch {
    public static int LinearSearch(String Menu[],String Key){
        for (int i = 0 ; i < Menu.length; i++ ){
            if(Menu[i].equals(Key)){
                return i ;
            }
        }
        return -1 ;
    }
    public static void main(String args[]){
        String Menu[] = {"Chole Bhature","Samosa", "Idli" , "Sambar Vada", "Biryani" };
        String Key = "Samosa";
        int Index = LinearSearch(Menu, Key);
        if (Index == -1 ){
            System.out.println("The item is not in the menu");
        } else {
            System.out.println("The key " + Key + " is at Index = " + Index);
        }
    }
}
