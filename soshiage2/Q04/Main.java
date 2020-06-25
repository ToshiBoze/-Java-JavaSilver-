public class Main extends Sample{
    public void process() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        Sample s = new Main();
        Sample s2 = new Sample();
        test(s);
        test(s2);
    }
    public static void test(Function f) {
        f.process();
    }
}
