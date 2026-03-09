import java.util.*;

public class anagram {
    public static void main(String[] args) {
        String str1 = "heeloworld".toLowerCase();
        String str2 = "heelooo".toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("not anagram");
            return;
        }

        char ch[] = new char[str1.length()];
        char ch1[] = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            ch[i] = str1.charAt(i);
        }

        for (int i = 0; i < str2.length(); i++) {
            ch1[i] = str2.charAt(i);
        }

        /*
         * Arrays.sort(ch);
         * Arrays.sort(ch1);
         * if(Arrays.equals(ch, ch1)){
         * System.out.println("anagram");
         * }
         */

        int count[] = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            
            char c = str1.charAt(i);
            count[c - 'a']++;
        }

        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            count[c - 'a']--;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                System.out.println("not ana");
                return;
            }
        }
        System.out.println("anagarma");
    }
}
