public class count_char {
    public static void main(String[] args) {
        String s ="hello";

        int count=0;
        try {
            while (true) { 
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        System.out.println(count);
    }
}
