import java.util.List;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        System.out.println(list.remove("b"));
        if (list.remove("b")) {
            list.remove("d");
        }
        System.out.println(list.toArray());
    }
}
