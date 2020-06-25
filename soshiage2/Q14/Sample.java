public class Sample{
    public static void main(String[] args) {
        Item[] items = new Item[3];
        items[1] = new Item("A");
        items[2] = new Item("A");
        for (Item item : items) {
            System.out.println(item.name);
        }
    }
}
