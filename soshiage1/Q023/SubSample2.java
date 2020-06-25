public class SubSample2 extends Sample2 {
    int price;
    public SubSample2(int price) {
        this.price = price;
    }
    public SubSample2(String name, int num, int price) {
        super(name, num);
        this.price = price;
    }
}
