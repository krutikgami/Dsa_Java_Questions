package Strings;

public class convert_letter_to_uppercase {
    public static String letter_upper(String tem){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(tem.charAt(0));
        sb.append(ch);
        for(int i=1;i<tem.length();i++){
            if (tem.charAt(i)== ' ' && i<tem.length()-1) {
                sb.append(tem.charAt(i));
                i++;
                ch = Character.toUpperCase(tem.charAt(i));
                sb.append(ch);
            }else{
                sb.append(tem.charAt(i));
            }
        }

        return sb.toString();
    }
   public static void main(String[] args) {
      String tem  = "hi my name is krutik";
        System.out.println(letter_upper(tem));
   } 
}
