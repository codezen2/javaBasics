import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;

public class ZonedDemo {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("Default Zone: " + ldt);

		// zone datetime of tokio
		ZonedDateTime tokyo = ldt.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokio Zone: " + tokyo);

		// Hijran Date
		HijrahDate ramadan = HijrahDate.now();
		System.out.println(" " + ramadan);
	}

}
