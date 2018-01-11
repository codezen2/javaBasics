import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class AdjustersDemo {

	public static void main(String[] args) {

		DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE : dd-MMM-yyyy");
		LocalDate ldt = LocalDate.now();

		System.out.println("Ist day of current month : " + df.format(ldt.with(TemporalAdjusters.firstDayOfMonth())));
		System.out.println("Last day of current month : " + df.format(ldt.with(TemporalAdjusters.lastDayOfMonth())));
		System.out.println("Last day of current Year: " + df.format(ldt.with(TemporalAdjusters.lastDayOfYear())));
		System.out.println("Next Monday : " + df.format(ldt.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY))));
		System.out.println("Ist day of Next Month: " + ldt.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("Ist day of Next Year: " + ldt.with(TemporalAdjusters.firstDayOfNextYear()));

	}

}
