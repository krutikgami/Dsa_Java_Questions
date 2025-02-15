package Heaps;

public class heapSort {

    public static void heapify(int arr[],int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int maxIndex = i;

        if(left < arr.length && arr[left] > arr[maxIndex]){
            maxIndex = left;
        }

        if(right < arr.length && arr[right] > arr[maxIndex]){
            maxIndex = right;
        }

        if(maxIndex!=i){
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;

            heapify(arr, maxIndex, n);
        }
    }
    public static void heap_Sort(int arr[]){
        int n = arr.length;
        for(int i = n/2;i>=0;i--){
            heapify(arr,i,n);
        }

        for(int i = n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,0,i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4};
        heap_Sort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
