import java.time.LocalDate;

public class Sample2 {
    public static void main(String[] args) {
        LocalDate a = LocalDate.of(2015, 1, 1);
        LocalDate b = LocalDate.parse("2020-06-31");
        System.out.println(b);
        System.out.println(a.equals(b));
    }
}
