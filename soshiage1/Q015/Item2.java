public class Item2 {
    String name;
    int price = 100;
    public Item2(String name) {
        this.name = name;
    }
    public Item2(String name, int age) {
        this(name);
        this.name = name;
    }
    public String toString() {
        return name + " " + price;
    }
    public static void main(String[] args) {
        Item2 p1 = new Item2("apple");
        Item2 p2 = new Item2("banana", 200);
        System.out.println(p1);
        System.out.println(p2);
    }
}
