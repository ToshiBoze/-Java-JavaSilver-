public class B2 extends A2{
    private int num;
    public B2(int num) {
        super(num);
    }
    public boolean equals(Object obj) {
        B2 b2 = (B2) obj;
        return this.num == b2.num;
    }
}