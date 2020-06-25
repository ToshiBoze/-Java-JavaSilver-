public class Main2 {
    public static void main(String[] args) {
        char[] array = "HelloWorld".toCharArray();
        char[] array2 = new char[array.length];
        System.arraycopy(array, 1, array2, 1, array.length - 1);
        System.out.println(array2);
    }
}
