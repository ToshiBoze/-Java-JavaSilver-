import java.io.IOException;

class X3_2 {
    public void print() throws IOException {
        
        throw new IOException();
    }
}
public class Sample3_2 {
    public static void main(String[] args) {
        X3_2 obj = new X3_2();
        try {
            obj.print();
        } catch (IOException e) {
        } catch (Exception e) {}
    }
}
