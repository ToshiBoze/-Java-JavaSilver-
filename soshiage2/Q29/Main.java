import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 32);
        date.plusDays(10);
        System.out.println(date);
    }
}
