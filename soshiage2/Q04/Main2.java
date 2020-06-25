public class Main2 extends Sample2{
    public void process() {
        System.out.println("B");
    }
    public static void main(String[] args) {
        Sample2 s = new Main2();
        Sample2 s2 = new Sample2();
        test(s);
        test(s2);
    }
    public static void test(Function2 f) {
        f.process();
    }
}
