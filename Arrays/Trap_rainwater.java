package Arrays;

public class Trap_rainwater {
    public static void trap_rain(int height[]){
        int left_arr[] = new int [height.length];
        int right_arr[] = new int [height.length];
        int a,b;
        int sum =0,waterlevel,j=height.length-1;


        for (int i = 0; i < height.length; i++) {
            left_arr[i] = height[i];
            right_arr[i] = height[j];
           

            a = height[i];
            b = height[j];
            
            int z = Math.min(left_arr[i],right_arr[i]);
            System.out.println(z);
            waterlevel = z-height[i];
            sum= sum + waterlevel;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int height [] = {4,2,0,6,3,2,5};
        trap_rain(height);
    }
}
