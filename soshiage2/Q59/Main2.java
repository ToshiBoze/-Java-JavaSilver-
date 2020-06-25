public class Main2 {
    private static int num;
    static {
        num = 10;
    }
    static {
        num = 20;
    }
    static void test(int num2) {
        num = num2 * num2;
    }
    public static void main(String[] args) {
        test(num);
        System.out.println(num);
    }
}
