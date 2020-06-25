public class Main2_2 {
    public static void main(String[] args) {
        String[][] array = new String[2][2];
        array[0][0] = "a";
        array[0][1] = "b";
        array[1][0] = "c";
        array[1][1] = "d";
        for (int i = 0; i < 2; ++i) {
            System.out.println("i: " + i);
            for (int j = 0; j < i; ++j) {
            System.out.println("j: " + j);
                System.out.print(array[i][j]);
            }
        }
    }
}
