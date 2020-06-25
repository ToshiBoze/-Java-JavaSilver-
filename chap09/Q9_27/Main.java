import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(0, 1, 2);
        time.plusHours(12);
        System.out.println(time);
    }
}
