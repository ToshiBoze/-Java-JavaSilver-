public class Main {
    public static void main(String[] args) {
        String val = "A";
        Function f = (val) -> {
            System.out.println(val);
        };
        f.test("B");
    }
}
interface Function {
    void test(String val);
}
