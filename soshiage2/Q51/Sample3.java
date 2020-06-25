public class Sample3 {
    public static void main(String[] args) {
        Test3 t = new Test3();
        t.num = 3;
        StringBuilder sb = new StringBuilder("A");
        Integer i = 2;
        t.test(i);
        t.sample(sb);
        t.test(t.num);
        System.out.println(i + " " + sb + " " + t.num);
    }
}
