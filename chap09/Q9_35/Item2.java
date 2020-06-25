public class Item2 {
    private String name;
    private int price;
    public Item2(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public boolean equals(Object obj) {
        if (obj instanceof Item2) {
            Item2 tmp = (Item2) obj;
            if (tmp.name.equals(this.name) && (int)tmp.price == this.price) {
                return true;
            }
        }
        return false;
    }
    public String getName() {
        return name;
    }
}