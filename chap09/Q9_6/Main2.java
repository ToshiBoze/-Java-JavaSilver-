public class Main2 {
    public static void main(String[] args) {
        String str = " a b c d e \t ";
        String str2 = " a b c d e \n ";
        String str3 = " a b c d e \n\r ";
        System.out.println("str: [" + str + "]");
        System.out.println("str.trim(): [" + str.trim() + "]");
        System.out.println("str2: [" + str2 + "]");
        System.out.println("str2.trim(): [" + str2.trim() + "]");
        System.out.println("str3: [" + str3 + "]");
        System.out.println("str3.trim(): [" + str3.trim() + "]");
    }
}
