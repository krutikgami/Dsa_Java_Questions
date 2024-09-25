package Recursion;
// Tiling problem has floor of 2 * n and tile of 2 * 1 
//Total possible way to fill the floor with tile 
//For that we  have to add the total possible way to fill the floor with tile
//Total possible way is horizontal + vertical way
class Tiling_Problem {
public static int tiling(int n){
    if(n<0){
        return -1;
    }
    else if(n==0 || n==1){
        return 1;
    }
    
    return  tiling(n-1) + tiling(n-2);
}
    public static void main(String[] args) {
        int n = 3;
        System.out.println(tiling(n));
    }
}
