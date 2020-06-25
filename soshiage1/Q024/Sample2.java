import java.util.List;
import java.util.ArrayList;

public class Sample2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D", 0);
        System.out.println(list);
    }
}
