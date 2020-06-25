public class Item {
    private String name;
    private int price;
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item tmp = (Item) obj;
            if (tmp.name.equals(this.name)) {
                return true;
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }
}