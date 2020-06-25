import java.time.LocalDate;
import java.time.Period;

public class Main2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate target = now.plusDays(10);
        Period x = now.until(target);
        Period y = now.minus(10);
        System.out.println("now.until(): " + now.until(target));
        System.out.println("x.between(): " + x.between(now, target));
        System.out.println("x.getDays: " + x.getDays());
        System.out.println("y.getDays: " + y.getDays());
    }
}
