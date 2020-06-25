public class Main2 {
    public static void main(String[] args) {
        String val = "A";
        Function f = (val2) -> {
            System.out.println(val2);
        };
        f.test("B");
    }
}
interface Function {
    void test(String val);
}
