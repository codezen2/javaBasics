import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

	public static void main(String[] args) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		// convert string into local Date
		String str = "12-Feb-2014";
		LocalDate Idt = LocalDate.parse(str, df);
		System.out.println(Idt);

		// convert Local Date into string
		LocalDate Idt2 = LocalDate.of(2016, 07, 21);
		System.out.println(Idt2.format(df));
	}

}
