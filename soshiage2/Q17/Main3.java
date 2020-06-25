public class Main3 {
    static int a = 0, b = 0;
    public static void main(String[] args) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int c = new Main3().calc(2, 3);
        System.out.println(c);
    }
    int calc(int a, int b) {
        return a * b;
    
    }
}
