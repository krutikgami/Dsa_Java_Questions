package BitManipulation;

public class powerOfTwoOrNot {
    public static boolean isPowerOfTwo(int n) {
        if (n == 0 && Integer.MAX_VALUE == n) {
            return false;
        }
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2147483648));
    }
}
