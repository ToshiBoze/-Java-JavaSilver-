public class Main2 {
    public static void main(String[] args) {
        String str = "a. b. c. d. e";
        String[] array = str.split(".\\s");
        String[] array2 = str.split("\\s");
        for (String s : array) {
            System.out.print(s);
        }
        System.out.println();
        for (String s : array2) {
            System.out.print(s);
        }
    }
}
