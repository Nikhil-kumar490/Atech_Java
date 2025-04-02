import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time {
    public static void main(String[] args) {
        // Geting Curent date and time
        //LocalDate --> Represent a date(YYYY-MM-DD) without time.
        //LocalTime --> Represent a date(HH:MM:SS)
        //Local D & T --> Represent both

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(date);
        System.out.println(time);

        DateTimeFormatter fort= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String F_date = dt.format(fort);
        System.out.println(dt);
    }
}
