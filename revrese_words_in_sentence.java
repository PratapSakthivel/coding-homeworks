class reverse {
    public static void main(String[] args) {
        String s = "I love Java";

        String[] parts = s.split(" ");

        int i = 0;
        int j = parts.length - 1;

        while (i < j) {
            String temp = parts[i];
            parts[i] = parts[j];
            parts[j] = temp;
            i++;
            j--;
        }

        String str = String.join(" ", parts);

        System.out.println(str);

    }
}