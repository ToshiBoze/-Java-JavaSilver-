public class Main2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcde");
        sb.reverse();
        System.out.println("sb.reverse(): " + sb);
        sb.replace(1, 3, "a");
        System.out.println("result: " + sb);
    }
}
