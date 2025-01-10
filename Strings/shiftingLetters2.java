package Strings;
class shiftingLetters2 {
    public static String shiftingLetters(String s, int[][] shifts) {
        StringBuilder st = new StringBuilder(s);
        for (int i = 0; i < shifts.length; i++) {
            int k = shifts[i][0];
            int l = shifts[i][1];
            int m = shifts[i][2];
            if (m==1) {
                while (k<=l) {
                    int as = st.charAt(k);
                    if (as == 122) {
                        st.setCharAt(k, 'a');
                    }
                    else{
                        int as1 = st.charAt(k) + 1; 
                        st.setCharAt(k, (char)as1);
                    }
                    k++;
                }
            }else{
                while (k<=l) {
                    int as = st.charAt(k);
                    if (as == 97) {
                        st.setCharAt(k, 'z');
                    }
                    else{
                        int as1 = st.charAt(k) - 1; 
                        st.setCharAt(k, (char) as1);
                    }
                    k++;
                }
            }
        }

        return st.toString();

    }
    public static void main(String[] args) {
        String s = "abc";
        int [][] shifts = {{0,1,0},{1,2,1},{0,2,1}};
        System.out.println(shiftingLetters(s, shifts));
    }
}

