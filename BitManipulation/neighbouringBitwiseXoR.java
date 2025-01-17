package BitManipulation;
class neighbouringBitwiseXoR {
    public static boolean doesValidArrayExist(int[] derived) {
       
        int xor = 0;
        for(int i=0;i<derived.length;i++){
          xor = xor ^ derived[i];
        }
        return xor ==0;
    }
    public static void main(String[] args) {
        int[] derived = {1,0};
        System.out.println(doesValidArrayExist(derived));
    }
}