public class duplicae_char {
    public static void main(String[] args) {
        String s = "heello";
        int size[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            size[ch - 'a']++;

            if (size[ch - 'a'] == 2) {
                System.out.print(ch);

            }
        }
    }
}
