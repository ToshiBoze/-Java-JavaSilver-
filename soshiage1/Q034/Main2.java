public class Main2 {
    String val = "7";
    public void doStuff(String str) {
        int num = 0;
        try {
            String val = str;
            num = Integer.parseInt(val);
        } catch (NumberFormatException e) {
            System.out.println("error");
        }
        System.out.println("val = " + val + ", num = " + num);
    }
    public static void main(String[] args) {
        doStuff("9");
    }
}
