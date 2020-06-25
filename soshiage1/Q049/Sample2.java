public class Sample2 {
    String a;
    boolean b;
    double c;
    public Sample2() {
        this.a = new String("sample");
        this.b = new Boolean(true);
        this.c = new Double(100);
    }
    public String toString() {
        return "toString(): " + a + ":" + b + ":" + c;
    }
    public static void main(String[] args) {
        Sample2 s = new Sample2();
        System.out.println(s);
    }
}
