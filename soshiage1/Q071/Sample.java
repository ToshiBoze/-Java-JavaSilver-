public class Sample {
    private char a;
    private int b = 1;
    String test(char a, int b) {
        return a + ", " + b;
    }
    public static void main(String[] args) {
        Sample app = new Sample();
        System.out.println(app.test('A'));
    }
}