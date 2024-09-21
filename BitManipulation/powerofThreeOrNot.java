package BitManipulation;
class powerofThreeOrNot {
    public static boolean isPowerOfThree(int n) {
        if(n==1 ){
            return true;

        }
        else if(n<=0){
            return false;
        }
        else{
            while(n>0){
                if(n%3 !=0){
                    return false;
                }

                n = n/3;
                if (n==1){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfThree(26));
    }

}
