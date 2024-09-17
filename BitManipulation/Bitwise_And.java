package BitManipulation;

public class Bitwise_And {
    public static int rangeBitwiseAnd(int left, int right) {
        return (left & right);
    }
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(1, 2147483647));
    }
}
