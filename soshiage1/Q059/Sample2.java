public class Sample2 {
    public static void main(String[] args) {
        try {
            test();
        } catch (MyException e) {
            System.out.println("A");
        }
    }
    public static void test() throws RuntimeException{
            throw Math.random() > 0.5 ? new MyException() : new RuntimeException();
    }
}

class MyException2 extends RuntimeException{}