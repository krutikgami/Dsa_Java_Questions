package BitManipulation;
public class count_set_bits_number {
    public static int CountBits(int n){
        if (n<=0){
            return 0;
        }
        int count =0;
        while (n>0) {
            
            if ((n & 1) != 0) {
                count ++;
            }
            n= n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountBits(2147483645));
    }
}
