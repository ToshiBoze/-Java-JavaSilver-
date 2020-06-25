public class Sample2 {
    public static void main(String[] args) {
        short a = 97;
        int b = 98;
        System.out.println("(char)97 : " + (char) a + " ");
        System.out.println("(char)98 : " + (char) b);
        System.out.println();
        
        for (int i = 32; i < 2048; i++) {
            System.out.println("(char)" + i + ": " + (char)i);
        }
    }
}
