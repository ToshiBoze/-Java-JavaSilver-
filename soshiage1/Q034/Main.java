public class Main {
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
        new Main().doStuff("9");
    }
}
