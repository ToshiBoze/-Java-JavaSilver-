public class Sample3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String str = "";
        System.out.println("sb: 「" + sb + "」");
        System.out.println("sb.toString(): 「" + sb.toString() + "」");
        System.out.println("sb.toString().equals(str.toString()): " + sb.toString().equals(str.toString()));
        System.out.println("sb.equals(str.toString()): " + sb.equals(str.toString()));
        if (sb.equals(str)) {
            System.out.println("A");
        } else if (sb.toString().equals(str.toString())) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
