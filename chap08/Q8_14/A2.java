public class A2 {
    private int num;
    public A2(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        A2 a2 = (A2) obj;
        return this.num == a2.num;
    }
}