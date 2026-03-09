public class CaesarCipher {

    public static void main(String[] args) {

        String plaintext = "this is secret msg";
        int shift = 5;   

        String encryptedText = encrypt(plaintext, shift);
        System.out.println("Encrypted text: " + encryptedText);

        String decryptedText = decrypt(encryptedText, shift);
        System.out.println("Decrypted text: " + decryptedText);
    }

    public static String encrypt(String text, int shift) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char newChar = (char) ((ch - 'a' + shift) % 26 + 'a');
                result += newChar;
            }
            else {
                result += ch;
            }
        }
        return result;
    }

    public static String decrypt(String text, int shift) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char newChar = (char) ((ch - 'a' - shift + 26) % 26 + 'a');
                result += newChar;
            } else {
                result += ch;
            }
        }
        return result;
    }
}
