public class Main {
    public static void main(String[] args) {
        try {
            if (args.length == 0) {
                sample(null);
            } else {
                sample(args[0]);
            }
        } catch (RuntimeException e) {
            System.out.println("error");
        }
    }
    private static void sample(String str) {
        if (str == null) throw new Exception();
        throw new RuntimeException();
    }
}
