package Strings;

class FirstOccurrence {
    public static int strStr(String haystack, String needle){
        int hlen = haystack.length();
        int nlen = needle.length();

        for(int i=0;i<=hlen-nlen;i++){
            int j;
            for(j=0;j<nlen;j++){
                if (haystack.charAt(i+j)!= needle.charAt(j)) {
                    break;
                }
            }
            if (j==nlen) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String str1 = "sadbutsad",str2 = "sad";
        System.out.println(FirstOccurrence.strStr(str1,str2));
    }
}
