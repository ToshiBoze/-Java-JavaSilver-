class Main5 {
  public static void main(String[] args) {
    Item[] item = new Item[3];
    int total = 0;
    item[0] = new Item();
    item[1] = new Item();
    item[2] = new Item();
    for (int i = 0; i < item.length; i++){
        total += item[i].price;
    }
    System.out.println(total);
  }
}
