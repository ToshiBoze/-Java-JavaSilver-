public class Main2 {
    public static void main(String[] args) {
        //int[][] array = {{1,2,3}, {4,5,6}};
        int[] array = {0, 1};
        int[][][] array2 = new int [2][2][2];
        array2[0][0] = array;
        array2[0][1] = array;
        array2[1][0] = array;
        array2[1][1] = array;
        System.out.println(array2[0][0][1]);
    }
}