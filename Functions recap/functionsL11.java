public class functionsL11 {

    public static void Bintodec(int BinNum){
        int Mynum = BinNum;
        int pow = 0 ;
        int decNum = 0 ;

        while(BinNum > 0){
            int lastdigit = BinNum % 10 ;
            decNum = decNum + (lastdigit * (int)Math.pow(2, pow));
            pow ++;
            BinNum = BinNum / 10;
        }
        System.out.println("the conversion from Binary " + Mynum + " to decimal is " + decNum);
    
    }
    public static void main (String args[]){
          Bintodec(111);
    }
}