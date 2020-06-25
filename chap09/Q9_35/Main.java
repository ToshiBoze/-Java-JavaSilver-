import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("A", 100));
        list.add(new Item("B", 200));
        list.add(new Item("C", 300));
        list.add(new Item("A", 100));
        list.remove(new Item("A", 500));
        for (Item item : list) {
            System.out.println(item.getName());
        }
    }
}
