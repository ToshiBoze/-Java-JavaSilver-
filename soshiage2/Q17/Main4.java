public class Main4 {
    static int a, b;
    public static void main(String[] args) {
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int c = new Main4().calc(2, 3);
        System.out.println(c);
    }
    int calc(int a, int b) {
        return a * b;
    
    }
}
