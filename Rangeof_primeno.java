public class Rangeof_primeno {
    public static boolean primeno(int n){
        if(n==1 || n==0){
            return false;
        }
        for(int i = 2; i<=n-1;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void Rangeofprimeno(int n){
        int count =0;
        for(int i = 2;i<=n;i++){
            if (primeno(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("");
        System.out.println("Total count: "+count);
    }

    public static void main(String[] args) {
        Rangeofprimeno(20);
    }
}
