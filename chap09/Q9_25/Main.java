import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Sample> list = Arrays.asList(
            new Sample(10),
        new Sample(20),
        new Sample(30));
        Predicate<Sample> x = s -> list.contains(s);
        if (x.test(new Sample(20))) {
            System.out.println("ok");
        }
    }
}
class Sample {
    private int num;
    public Sample(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Sample == false) {
            return false;
        }
        if (this.num == ((Sample) obj).num) {
            return true;
        }
        return false;
    }
}
