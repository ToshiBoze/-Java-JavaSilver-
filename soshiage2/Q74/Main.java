public class Main {
    private int sample(double val) {
        System.out.println("A");
        return 0;
    }
    private String sample(double val) {
        System.out.println("B");
        return null;
    }
    private double sample(double val) {
        System.out.println("C");
        return 0.0;
    }
    public static void main(String[] args) {
        new Main().sample(1.0);
    }
}
