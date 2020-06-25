import java.io.IOException;

class X {
    public void print() {
        
        throw new IOException();
    }
}

public class Sample {
    public static void main(String[] args) {
        X obj = new X();
        obj.print();
    }
}
