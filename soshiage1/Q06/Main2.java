import java.util.List;
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try {
            while (true) {
                list.add("hello");
            }
        } catch (RuntimeException e) {
            System.out.println("A");
        } catch (Error e) {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("B");
        }
            System.out.println("C");
    }
}
