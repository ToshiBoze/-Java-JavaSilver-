public class Main2 {
    public static void main(String[] args) {
        SubSample2 s1 = new SubSample2(100);
        SubSample2 s2 = new SubSample2("sample", 200, 100);
        System.out.println(s1.name + ", " + s1.num + ", " + s1.price);
        System.out.println(s2.name + ", " + s2.num + ", " + s2.price);
    }
}
