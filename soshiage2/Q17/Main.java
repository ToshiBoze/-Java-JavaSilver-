public class Main {
    int a = 0;
    int b = 0;
    public static void main(String[] args) {
        int c = new Main().calc(2, 3);
        System.out.println(c);
    }
    int calc(int a, int b) {
        return a * b;
    
    }
}
