public class Decimal_binary {

    public static void decimal_binary(int dec){
        int pow =0;
        int binnum =0;

        while (dec>0) {
            int rem = dec%2;
            binnum = binnum + rem *(int)Math.pow(10,pow);
            pow++;
            dec = dec/2;
        }
        System.out.print("Binary number: "+binnum);
    }
    public static void main(String[] args) {
        decimal_binary(1023);
    }
}
