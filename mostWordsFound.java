public class mostWordsFound {
    public static void main(String[] args) {
        String[] add = { "alice and bob love leetcode", "i think so too", "this is great thanks very much" };

        int max = 0;

        for (int i = 0; i < add.length; i++) {
            int count = 0;
            String[] parts = add[i].split(" ");

            count = parts.length;
            if (count > max) {
                max = count;
            }

        }

        System.out.println(max);

    }

}
