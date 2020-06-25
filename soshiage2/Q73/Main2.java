public class Main2 {
    public static void main(String[] args) {
        new Main2().test("a", 0, 0.0, false, new Main2());
    }
    private void test(String str, int num, double val, boolean flg, Object obj) {
        System.out.println(str + num + val + flg + obj);
    }
}
