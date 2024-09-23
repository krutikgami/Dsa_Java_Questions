package Recursion;
// array key is present if present than return the starting index of  the number 
public class First_Occurence {
    public static int firstOcc(int arr[],int key,int i){
        if (arr[i]==key) {
            return i;
        }
        return firstOcc(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,4,5,7,8};
        int key  = 4;
        System.out.println(firstOcc(arr, key, 0));
    }
}
