public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 4};
        int[] array2 = array.clone();
        array2[0] = 5;
        for (int i : array) {
            System.out.println(i);
        }
    }
}
