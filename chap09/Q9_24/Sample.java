public class Sample {
    public static void main(String[] args) {
        int cnt = 0;
        Runnable r = () -> {
            for (cnt = 0; cnt < 10; cnt++) {
                System.out.println(cnt++);
            }
        };
    	new Thread(r).start();
    }
}
