public class Main {
    public static void main(String[] args) {
        String val = "1";
        int num = 10;
        if ((num = num + 10) == 100)
            val = "A";
        else if ((num = num + 29) == 50)
            val = "B";
        else if ((num = num + 200) == 10)
            val = "C";
        else
            val = "F";
        System.out.println(val + ":" + num);
    }
}
