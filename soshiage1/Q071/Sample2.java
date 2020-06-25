public class Sample2 {
    private char a;
    private int b = 1;
    String test(char a, int b) {
        return a + ", " + b;
    }
    public static void main(String[] args) {
        Sample2 app = new Sample2();
        System.out.println(app.test('A', 1));
    }
}