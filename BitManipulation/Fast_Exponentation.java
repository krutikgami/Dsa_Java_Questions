package BitManipulation;

public class Fast_Exponentation {
    public static int fast_Exponentation(int a,int n){
        int ans = 1;
        while (n>0) {
            if ((n & 1) !=0) {
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(fast_Exponentation(3, 5));
    }
}
