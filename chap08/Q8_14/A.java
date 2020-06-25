public class A {
    private int num;
    public A(int num) {
        this.num = num;
    }
    public boolean equals(Object obj) {
        A a = (A) obj;
        return this.num == a.num;
    }
}