public class Main2 {
    private int sample(double val) {
        System.out.println("A");
        return 0;
    }
    private String sample2(double val) {
        System.out.println("B");
        return null;
    }
    private double sample3(double val) {
        System.out.println("C");
        return 0.0;
    }
    public static void main(String[] args) {
        new Main2().sample(1.0);
    }
}
