public class Main2 {
    public static void main(String[] args) {
        String str = "a b 3 d e";
        String[] array = str.split("\\d");
        System.out.println(array.length);
        System.out.println("array[0].length(): " + array[0].length());
        System.out.println("array[1].length(): " + array[1].length());
    }
}