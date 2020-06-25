class Main {
    public static void main(String[] args) {
        int result = sample();
        System.out.println(result);
    }
    private static int sample() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            return 10;
        } finally {
            return 20;
        }
    }
}
