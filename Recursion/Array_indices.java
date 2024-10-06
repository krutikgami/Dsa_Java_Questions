// To find array indices of given key in an array using recursion
package Recursion;

public class Array_indices {
    public static void arrayIndices(int arr[],int key,int i){
        if(i == arr.length){
            return;
        }
        
        if(arr[i]==key){
            System.out.print(i+ " ");
            arrayIndices(arr, key, i+1);
        }
        else{
            arrayIndices(arr, key, i+1);
        }
    }
    public static void main(String[] args) {
        int arr [] = {2,3,4,5,2,4,6,2,3,2};
        int i =0, key = 2;
        arrayIndices(arr, key, i);
    }
}
