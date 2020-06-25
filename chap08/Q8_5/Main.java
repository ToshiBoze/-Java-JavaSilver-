class Main {
    public static void main(String[] args) {
        System.out.println(test(null));
    }
    private static String test(Object obj) {
        try {
            System.out.println(obj.toString());
        } catch (NullPointerException e) {
            return "A";
        } finally {
            System.out.println("B");
        }
        return "C";
    }
}
