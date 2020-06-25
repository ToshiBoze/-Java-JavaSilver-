import java.util.ArrayList;
import java.util.Iterator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("list.size(): " + list.size());
        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            String str = ite.next();
            if("C".equals(str)) {
                ite.remove();
            }
        }
        while (ite.hasNext()) {
            String s = ite.next();
            System.out.println(s);
        }
    }
}
