public class Main {
    public static void main(String[] args) {
        String[] str = new String[2];
        int i = 0;
        for (String s : str) {
            str[i].concat("e" + 1);
            i++;
        }
        for (i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
}
