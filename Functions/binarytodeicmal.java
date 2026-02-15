public class binarytodeicmal {

    public static void binTodec(int binNum){
       int Mynum = binNum;
       int pow = 0 ;
       int decimal = 0 ;

       while(binNum > 0){
        int lastdigit = binNum % 10 ;
          decimal = decimal + (lastdigit * (int)Math.pow(2, pow));

          pow ++ ;
          binNum = binNum / 10;
       }
System.out.println("My binary " + Mynum + " to decimal = " + decimal);
    }
    public static void main(String args[]){
        binTodec(101);
    }
}