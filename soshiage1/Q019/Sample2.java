public class Sample2 {
    public static void main(String[] args) {
        double a = 0;
        int b = 81;
//        a = (b >= 90) ? 0.5 : (b > 80) ? 0.2 : 0;
        if (b > 80 && b < 90) {
            a = 0.2;
        } else if (b >= 90) {
            a = 0.5;
        } else {
            a = 0;
        }
        System.out.println(100 * a);
    }
}
