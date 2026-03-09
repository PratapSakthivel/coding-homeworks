public class permutation_palindrome {
    public static void main(String[] args) {
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccccccddddddddddddddddddddddde";

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        int odd = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                odd++;
            }
            if (odd > 1) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
