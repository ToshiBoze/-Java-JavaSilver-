import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("A");
        list.remove(new String("A"));
        for (String str : list) {
            System.out.println(str);
        }
    }
}
