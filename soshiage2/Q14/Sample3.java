public class Sample3 {
    public static void main(String[] args) {
        Item3[] items = new Item3[3];
        items[1] = new Item3("A");
        items[2] = new Item3("A");
        for (Item3 item : items) {
            System.out.println("item.length() == 0 : " +  == 0);
            if (item == null) {//�g��ofr���ł́Anull�`�F�b�N���s���Ȃ��B
//                System.out.println(item.name);
            }
        }
        //System.out.println(items[0].name);
        System.out.println(items[1].name);    }
}
