import java.util.*;;
import java.util.function.*;

public class Main2 {
    public static void test(List<Sample2> list, Predicate<Sample2> p) {
        for (Sample2 s : list) {
            if (p.test(s)) {
                System.out.println(s.str);
            }
        }
    }
    public static void main(String[] args) {
        List<Sample2> list = Arrays.asList(new Sample2("A", 30),
            new Sample2("B", 20),
            new Sample2("C", 10));
            test(list, (Sample2 s) -> {return s.getNum() > 20;});
    }
}
