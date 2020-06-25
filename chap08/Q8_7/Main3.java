public class Main3 {
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
            String exceptionMessage = e.getClass().getName() + ": " + e.getMessage();
            System.out.println("e.getClass(): " + e.getClass());
            System.out.println("e.getClass().getName(): " + e.getClass().getName());
            System.out.println("e.getMessage(): " + e.getMessage());
            val = 10;
            return val;
        } finally {
            val += 10;
        }
        return val;
    }
}
