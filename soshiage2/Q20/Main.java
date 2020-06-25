public class Main {
    public static void main(String[] args) {
        String[] array = {"A", "B"};
        int i = 0;
        while (i < array.length) {
            int j = 0;
            do {
                ++j;
            } while (j < array[i].length());
                System.out.println(array[i] + ":" + j);
            i++;
        }
    }
}
