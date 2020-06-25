public class Sample2 {
    public static void main(String[] args) {
        short s1 = 10;
        Integer s2 = 20;
        Long s3 = (long) s1 + s2;
        String s4 = String.valueOf(s3 + s2);
        System.out.println(s4);
    }
}
