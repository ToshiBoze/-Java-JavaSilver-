import java.util.List;
import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("hello");
            }
        } catch (Throwable e) {
            System.out.println("Throwable");
        }
            System.out.println("C");
    }
}
