public class Main {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }
    private static int sample() {
        int val = 0;
        try {
            String[] array = {"A", "B", "C"};
            System.out.println(array[3]);
        } catch (RuntimeException e) {
            val = 10;
            return val;
        } finally {
            val += 10;
        }
        return val;
    }
}
