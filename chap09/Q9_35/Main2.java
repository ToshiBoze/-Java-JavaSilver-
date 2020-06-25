import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Item2> list = new ArrayList<>();
        list.add(new Item2("A", 100));
        list.add(new Item2("B", 200));
        list.add(new Item2("C", 300));
        list.add(new Item2("A", 100));
        System.out.println(new Item2("A", 500));
        Item2 temp = new Item2("A", 500);
        System.out.println(temp.equals(new Item2("A", 500)));
        list.remove(new Item2("A", 100));
        for (Item2 item2 : list) {
            System.out.println(item2.getName());
        }
    }
}
