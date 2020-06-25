public class Main2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcde");
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder(0);
        System.out.println("sb: " + sb.capacity());
        System.out.println("sb2: " + sb2.capacity());
        System.out.println("sb3: " + sb3.capacity());
    }
}
