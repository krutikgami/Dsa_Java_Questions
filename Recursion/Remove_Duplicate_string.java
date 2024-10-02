package Recursion;
class Remove_Duplicate_string {

    public static void removeDuplicate(String str,int i,StringBuilder newStr,boolean map[]){
        if(i==str.length()){
            System.out.println(newStr);
            return;
        }
        char ch = str.charAt(i);
        if(map[ch -'a']==true){
            removeDuplicate(str, i+1, newStr, map);
        }
        else{
            map[ch-'a'] = true;
            removeDuplicate(str, i+1, newStr.append(str.charAt(i)), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        int i =0;
        boolean map[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");

        removeDuplicate(str, i, newStr, map);



    }
}
