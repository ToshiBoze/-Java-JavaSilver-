import java.time.Duration;
import java.time.LocalDateTime;

public class Sample2 {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2015, 1, 1, 0, 0);
        System.out.println("start date: " + start);
        LocalDateTime end = LocalDateTime.of(2016, 1, 2, 1, 0, 0);
        System.out.println("end date: " + end);
        Duration d = Duration.between(start, end);
        System.out.println("duration: " + d);
        System.out.println("Days: " + d.toDays());
        System.out.println("Hours: " + d.toHours());
        System.out.println("Millis: " + d.toMillis());
    }
}
