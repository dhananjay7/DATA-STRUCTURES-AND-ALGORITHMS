public class functionsL12 {
    public static void DectoBin(int decNum){
      int Mynum = decNum ;
        int pow = 0 ;
        int BinNum = 0 ;
        while(decNum > 0){
            int lastdigit = decNum % 2 ;
            BinNum = BinNum + (lastdigit * (int)Math.pow(10,pow));
            pow ++;
            decNum = decNum / 2 ;
        }
System.out.println("the decimal "+ Mynum + " to binary is "+ BinNum );

    }
    public static void main(String args[]){
        DectoBin(5);
    }
}
