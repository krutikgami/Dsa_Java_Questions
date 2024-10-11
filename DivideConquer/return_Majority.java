package DivideConquer;

public class return_Majority {
    public static void majority(int arr[]){
        int times = (int) Math.floor(arr.length/2);
        int count =0;
        int num =0;
        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
          for(int j = 0; j < arr.length; j++){  
            if (arr[i] == arr[j]) {
                count++;
            }

          }
        }
        if (count>times) 
            System.out.println(num);
    }
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        majority(arr);
    }
}
