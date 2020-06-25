import java.util.List;
import java.util.ArrayList;

public class Sample3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.set(0, "D");
        System.out.println(list);
    }
}
