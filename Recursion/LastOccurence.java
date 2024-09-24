package Recursion;

public class LastOccurence {
    public static int LasrOccur(int[] arr, int i, int j){
        if(j==arr.length){
            return -1;
        }
        int isFound = LasrOccur(arr,i,j+1);
        if(isFound!=-1){
            return isFound;
        }
        if(arr[j]==i){
            return j;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7,8,8,8};

        System.out.println(LasrOccur(arr,8,0));
    }
}
