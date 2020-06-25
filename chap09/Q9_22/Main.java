public class Main {
    public static void main(String[] args) {
        //Function f = (name) -> return "hello, " + name;
        Function f = (name) -> {
            return "hello, " + name;
        };
        System.out.println(f.test("Lambda"));
    }
    private static interface Function {
        String test(String name);
    }
}
