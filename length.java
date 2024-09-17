class Solution {
    public static String addStrings(String num1, String num2) {
        if(String.valueOf(num1).equals(2147483647) || String.valueOf(num2).equals(2147483647)){
            int s = Integer.parseInt(num1)+Integer.parseInt(num2);
            return String.valueOf(s);
        }
        else{
        long sum = Long.parseLong(num1) + Long.parseLong(num2);
        return String.valueOf(sum);
        }
    }
    
    public static void main(String args[]){
        String num1 = "2147483648";
        String num2 = "12";
        System.out.println(addStrings(num1,num2));
    }
}