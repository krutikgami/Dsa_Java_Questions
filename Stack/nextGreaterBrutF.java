package Stack;

public class nextGreaterBrutF {
    public static void nGreater(int arr[]) {
        int greater = -1;
        boolean a = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    greater = Math.max(greater, arr[j]);
                    a = true;

                } else {
                    greater = Math.max(greater, arr[i]);
                    a = true;
                }

                if (a) {
                    break;
                }
            }
            if (greater != arr[i]) {
                arr[i] = greater;
            } else {
                arr[i] = -1;
            }
            greater = -1;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        nGreater(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
