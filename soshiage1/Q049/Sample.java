public class Sample {
    String a;
    boolean b;
    double c;
    public Sample() {
        this.a = new String("sample");
        this.b = new Boolean(true);
        this.c = new Double(100);
    }
    public String toString() {
        return a + ":" + b + ":" + c;
    }
    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println(s);
    }
}
