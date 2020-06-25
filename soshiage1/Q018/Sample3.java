import java.io.IOException;

class X3 {
    public void print() {
        
        throw new IOException();
    }
}
public class Sample3 {
    public static void main(String[] args) {
        X3 obj = new X3();
        try {
            obj.print();
        } catch (Exception e) {
        } catch (IOException e) {}
    }
}
