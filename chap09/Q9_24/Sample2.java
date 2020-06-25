public class Sample2 {
    public static void main(String[] args) {
        int cnt = 0;
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i++);
            }
        };
    	new Thread(r).start();
    }
}
