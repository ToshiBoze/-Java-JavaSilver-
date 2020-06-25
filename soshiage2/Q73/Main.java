public class Main {
    public static void main(String[] args) {
        new Main().test("a", 0, 0.0, false);
    }
    private void test(String str, int num, double val, boolean flg, Object obj) {
        System.out.println(str + num + val + flg + obj);
    }
}
