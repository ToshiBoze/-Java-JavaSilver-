import java.util.List;
import java.util.ArrayList;

public class Sample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(0, "D");
        System.out.println(list);
    }
}
