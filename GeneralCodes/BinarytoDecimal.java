package GeneralCodes;

public class BinarytoDecimal {
    public static void bintodec(int a ){
        //  edu hosa logic ,...imp 
        int n = a ;
        int pow =0;
        int dec =0;
        while (n>0) {
            int ld = n% 10;
            dec = dec +(ld*(int)Math.pow(2, pow));
            // here pow function will always return value in double , so we need to type cast it to int.
            pow++;
            n = n/10;
        }
        System.out.println("the decimal of given binary number " +a+" is "+dec);
    }

    public static void dectobin(int a){
        int n = a;
        int pow =0;
        int bin = 0;
        while(n>0){
            int rem = n % 2 ;
            bin = bin +(rem* (int)Math.pow(10, pow));
            n=n/2;
            // rember the logic doing in paper , its very important.
            pow++;
        }
        System.out.println("the binary of given number "+ a + " is "+bin);
    }

    public static void main(String[] args) {
        bintodec(1001);
        dectobin(20);
    }

}
