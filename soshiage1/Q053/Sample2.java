import java.time.*;;
import java.time.format.*;

public class Sample2 {
    public static void main(String[] args) {
        String date = LocalDate.parse("2015-08-23").format(DateTimeFormatter.ISO_DATE);
        System.out.print(date);
    }
}
