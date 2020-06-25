import java.io.IOException;

class X2 {
    public void print() throws IOException{
        
        throw new IOException();
    }
}

public class Sample2 {
    public static void main(String[] args) throws Exception{
        X2 obj = new X2();
        obj.print();
    }
}
