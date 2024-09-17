package Strings;

public class string_compression {
    public  static int compress(char[] chars) {
        // char[] chars1 = new char[chars.length];
        // for(int i =0;i<chars.length;i++){
        //    char count = 1;
            
        //    while ( i<chars.length-1 && chars[i] == chars[i+1]) {
        //         count ++;
        //         i ++;
        //         chars1 [i]  = chars[i];
        //    } 
        //    if (count>1) {
        //      chars1[i] = count;  
        //    }

        // }

        // return chars1.length;
        int ans = 0;

    for (int i = 0; i < chars.length;) {
      final char letter = chars[i];
      int count = 0;
      while (i < chars.length && chars[i] == letter) {
        ++count;
        ++i;
      }
      chars[ans++] = letter;
      if (count > 1)
        for (final char c : String.valueOf(count).toCharArray())
          chars[ans++] = c;
    }

    return ans;
    }
public static void main(String[] args) {
   char [] chars =  {'a','b','c','c','c'};
     System.out.println(compress(chars));
}
    
}