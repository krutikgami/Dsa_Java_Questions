package Backtracking;

public class subSets {

    public static void subSet(String str,String ans,int i){
        //base case
        if (i == str.length()) {
            if (i==0) {
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        //yes
        subSet(str, ans+str.charAt(i), i+1);
        //no
        subSet(str, ans, i+1);
    }
    public static void main(String[] args) {
        String s = "abc";
        subSet(s,"",0);
    }
}
