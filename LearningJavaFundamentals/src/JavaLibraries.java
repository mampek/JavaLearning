import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class JavaLibraries {
    public static void main(String[] args) {
        Date today = new Date();

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(today);
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH) - 1);
        System.out.println(calendar.getTime());

        GregorianCalendar birthday = new GregorianCalendar(1936, 3,16);
        Date birthdayDate = birthday.getTime();
        System.out.println(today);
        System.out.println(birthdayDate);
        System.out.println(birthday);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String prettyDate = sdf.format(birthdayDate);
        System.out.println(prettyDate);

        LocalDateTime theDateAndTime = LocalDateTime.now();
        LocalDateTime anotherDateAndTime = LocalDateTime.of(2022,11,16,17,15);
        LocalDate someDate = LocalDate.of(2022, 11, 16);
        LocalTime someTime = LocalTime.from(anotherDateAndTime);

        System.out.println(theDateAndTime);
        System.out.println(someTime);

    }
}
