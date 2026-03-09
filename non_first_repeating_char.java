public class non_first_repeating_char {
    public static void main(String[] args) {
        String s = "swiss";
        int size[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int result = c - 'a';
            size[result]++;
        }


        for (int i = 0; i <s.length(); i++) {
           
            char ch = s.charAt(i);
            int res=ch-'a';

            if(size[res]==1){
                System.out.println(ch);
                break;
            }
        }

    }

}
