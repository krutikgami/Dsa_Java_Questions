public class arraysum {
    public static void main(String[] args) {
        int arr [] = {1,2,13,15,4};
        int sum =0;
        for(int i =0; i<arr.length;i++){
            if (arr[i]==13) {
                i=i+1;
                continue;
            }else{
                sum =sum +arr[i];
            }
        }
        System.out.println(sum);
    }
}
