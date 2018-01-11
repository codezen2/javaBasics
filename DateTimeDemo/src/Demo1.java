import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Demo1 {

	public static void main(String[] args) {
		// localdate
		System.out.println(LocalDate.now());
		// local time
		System.out.println(LocalTime.now());
		// local date time
		System.out.println(LocalDateTime.now());
		// insant time
		System.out.println("TimeStamp: "+Instant.now());
	}

}
