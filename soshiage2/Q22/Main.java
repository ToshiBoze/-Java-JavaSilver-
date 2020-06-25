public class Main {
    public static void main(String[] args) {
        B obj1 = new A();
        T obj2 = new A();
        B a = obj2;
        T t = obj1;
        t.test();
        a.doIt();
    }
}
