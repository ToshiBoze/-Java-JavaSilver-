public class Item {
    String name;
    int price = 100;
    public Item(String name) {
        this();
        this.name = name;
    }
    public Item(String name, int age) {
        this(name);
        this.name = name;
    }
    public String toString() {
        return name + " " + price;
    }
    public static void main(String[] args) {
        Item p1 = new Item("apple");
        Item p2 = new Item("banana", 200);
        System.out.println(p1);
        System.out.println(p2);
    }
}
