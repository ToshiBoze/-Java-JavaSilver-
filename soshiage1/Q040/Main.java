import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        if (list.remove("b")) {
            list.remove("d");
        }
        System.out.println(list);
    }
}
