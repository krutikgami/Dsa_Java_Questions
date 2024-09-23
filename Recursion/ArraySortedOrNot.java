package Recursion;
//Array is sorted or not using recursion
public class ArraySortedOrNot {
    public static boolean isSorted(int arr [],int i){
        if (i == arr.length-1) {
            return true;
        }
       else if (arr[i] > arr[i+1]) {
            return false;
        }

        return isSorted(arr,i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,9,4,5};

        System.out.println(isSorted(arr,0));
    }
    
}
