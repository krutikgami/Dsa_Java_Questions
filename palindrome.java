class palindrome {
    public static boolean isPalindrome(int x) {
        String value = String.valueOf(x);
        StringBuilder sb = new StringBuilder(value);
        return sb.reverse().toString().equals(value);
    }
    public static void main(String[] args) {
           isPalindrome(-121);
    }
}