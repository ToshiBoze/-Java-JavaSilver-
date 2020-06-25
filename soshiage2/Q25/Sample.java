public class Sample {
    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test();
        a.sample();
        b.sample();
        System.out.println(a.value + "," + b.value);
    }
}
