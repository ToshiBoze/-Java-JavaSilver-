public class Main2 {
    public static void main(String[] args) {
        String[] array = {"abcde", "fgh", "ijk"};
        String[] array2 = new String[3];
        int i = 0;
        System.out.println("Before try-catch");
        try {
            for (String s : array) {
                array2[i] = s.substring(1, 4);
                i++;
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        System.out.println("After try-catch");
        for (String s : array2) {
            System.out.println(s);
        }
    }
}
