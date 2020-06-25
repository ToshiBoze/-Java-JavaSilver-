public class Main2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.insert(2, "b");
        sb.append("cde");
        sb.delete(1, 2);
        System.out.println(sb);
    }
}
