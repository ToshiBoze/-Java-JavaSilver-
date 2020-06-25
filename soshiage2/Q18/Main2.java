import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        if (list.removeIf((String s) -> {return s.length() == 5;})) {
            System.out.println(s);
        }
    }
}
