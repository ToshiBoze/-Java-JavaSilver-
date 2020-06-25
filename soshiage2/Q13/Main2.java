public class Main2 {
    static int num;
    private static void test() {
        num++;
        System.out.println(num);
    }
    public static void main(String[] args) {
        Main2.test();
        Main2.test();
    }
}
