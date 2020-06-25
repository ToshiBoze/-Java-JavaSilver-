public class Sample2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        t.num = 3;
        StringBuilder sb = new StringBuilder("A");
        Integer i = 2;
        Test2.test(i);
        System.out.println("before smple() sb: " + sb);
        Test2.sample(sb);
        System.out.println("after smple() sb: " + sb);
        Test2.test(t.num);
        System.out.println(i + " " + sb + " " + t.num);
    }
}
