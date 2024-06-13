public class Binary_decimal {
    public static void btod(int n){
        int decimal = 0 ;
        int pow = 0;
        while (n>0) {
            int lastdigit = n % 10;
            decimal = decimal + lastdigit * (int)Math.pow(2, pow);
            pow++;
            n = n/10;
        }
        System.out.print(decimal);
    }
    public static void main(String[] args) {
        btod(111);
    }
}
