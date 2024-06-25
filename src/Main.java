import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        String year = String.valueOf(data.getYear());
        String mounth = String.valueOf(data.getMonth());
        int day = data.getDayOfMonth();
        String dayOfWeek = String.valueOf(data.getDayOfWeek());


        System.out.println(year);
        System.out.println(mounth);
        System.out.println(day);
        System.out.println(dayOfWeek);
    }
}