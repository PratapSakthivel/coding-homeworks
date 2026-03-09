
public class remove_extra_char {
    public static void main(String[] args) {
        String s = "heeeeeelloo";

        int freq[] = new int[26];
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if (freq[index] == 0) {
                result = result + ch;   
            }

            freq[index]++;
        }

        System.out.println(result);
    }
}
