package DivideConquer;

public class search_rotated_sorted {
    public static int search(int num[] ,int tar,int si,int ei){
        int mid = si+(ei-si)/2;
        if(si>ei){
            return -1;
        }
        if(num[mid]==tar){
            return mid;
        }

        if(num[si]<=num[mid]){
            if (num[si]<=tar && tar<=num[mid]) {
                return search(num, tar, si, mid - 1);
            }else{
                return search(num, tar, mid + 1 , ei); 
            }
        }
        else{
            if(num[mid]<=tar && tar<=num[ei]){
                return search(num, tar, mid+1,ei );
            }else{
                return search(num, tar, si, mid-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
       int result = search(arr, target,0,arr.length-1);
       System.out.println(result);
    }
}
