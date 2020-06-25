public class Main {
    private static int num;
    static {
        num = 10;
    }
    static {
        num = 20;
    }
    static void test(int num) {
        num = num * num;
    }
    public static void main(String[] args) {
        System.out.println(num);
    }
}
