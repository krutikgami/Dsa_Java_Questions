package Arrays;
public class Senior_citizen {
    
        public static int countSeniors(String[] details) {
            int age_count = 0;

            for (int i = 0; i < details.length; i++) {
                int a = details[i].charAt(11) - '0';
                int b = details[i].charAt(12) - '0';
                if(a >= 6){
                    if(b == 0 && a==6){
                        
                        age_count = age_count;
                    }
                    else{
                        age_count++;
                    }
                    
                }
            }
            return age_count;
        }
    public static void main(String[] args) {
        String arr [] ={"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(arr));
    }
}
