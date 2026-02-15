public class linearSearch {
    public static int LinearSearch(int Numbers[], int key){
      for(int i = 0 ; i <Numbers.length ; i++){
        if(Numbers[i] == key){
          return i ; 
        }
      }
      return -1 ;
    }
    public static void main(String args[]){

      int Numbers[] = {2,4,1,5,8,10,7,9};
      int key = 10 ;
    int index =  LinearSearch(Numbers, key);   
    if (index == -1 ){
      System.out.println("KEY NOT FOUND");
    } else {
      System.out.println("The key is at index = " + index);
    }
    }
}
