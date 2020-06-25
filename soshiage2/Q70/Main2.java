public class Main2 {
    public static void main(String[] args) {
        sample(2, 3);
    }
/*
    private static void sample(int a, int b) {
        System.out.println(a + b);
    }
*/
    private static void sample(int... num) {
        for (int i : num) {
            System.out.println(i);
        }
    }
}
