public class Sample2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(5);
        String str = "";
        System.out.println("sb: 「" + sb + "」");
        System.out.println("sb.toString(): 「" + sb.toString() + "」");
        if (sb.equals(str)) {
            System.out.println("A");
        } else if (sb.toString().equals(str.toString())) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
