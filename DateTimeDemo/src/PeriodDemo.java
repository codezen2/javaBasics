import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		LocalDate dt1 = LocalDate.of(2016, 3, 5);
		LocalDate dt2 = LocalDate.of(2017, 12, 10);
		Period p = Period.between(dt1, dt2);
		System.out.println(p.getYears() + "  Years " + p.getMonths() + " Months and " + p.getDays() + " Days");
		System.out.println(p.getChronology());

		// duration between 2 times
		LocalTime t1 = LocalTime.of(11, 15);
		LocalTime t2 = LocalTime.now();
		// LocalTime t2 = LocalTime.of(10, 30);
		Duration d = Duration.between(t1, t2);
		System.out.println(d.getSeconds() + " Seconds and " + d.getNano() + " nanosec");
		System.out.println(d.getUnits());
		System.out.println(d.negated());

	}

}
