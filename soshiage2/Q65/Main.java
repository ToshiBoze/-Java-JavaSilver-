public class Main {
    public static void main(String[] args) {
        try {
            String[] array = new String[5];
            array[1] = "A";
            array[2] = "B";
            array[3] = "C";
            for (String str : array) {
                System.out.println(str);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
