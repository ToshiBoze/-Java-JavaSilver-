public class Sample3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int key = 3;
        int cnt = 0;
        for (int i : array) {
            if (i != key) {
                cnt++;
                System.out.println(i + "‰ñ–Ú:" + cnt);
                continue;
            }
        }
        System.out.print(cnt);
    }
}