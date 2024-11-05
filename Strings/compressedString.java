package Strings;
public class compressedString {
    public static String compress(String word){
        int count = 1;
        StringBuilder sb = new StringBuilder();
        char ch;
        for(int i = 0; i<word.length();i++){
          ch = word.charAt(i); 
      
            if (i<word.length()-1 && ch == word.charAt(i+1)) {
                if (count>=9) {
                    sb.append(count);
                    sb.append(ch);
                    count = 1;
                }else{
                    count++;
                }
            }else{
                sb.append(count);
                sb.append(ch);
                count =1;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "a";
        System.out.println(compress(s));
    }
}
