public class Sample2 {
    public static void main(String[] args) {
        Item2[] items = new Item2[3];
        items[1] = new Item2("A");
        items[2] = new Item2("A");
/*
        for (Item2 item : items) {
            System.out.println(item.name);
        }
*/
        //System.out.println(items[0].name);
        System.out.println(items[1].name);    }
}
