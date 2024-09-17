package Arrays;

public class reverse_array {
    public static void reverse(int arr []){
        int st =0,lt=arr.length-1;
        while (st<lt) {
            int temp = arr[st];
            arr[st] = arr[lt];
            arr[lt] = temp;
            st++;
            lt--;
        }
    }
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
