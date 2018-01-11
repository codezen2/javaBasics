import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionDemo {

	public static void main(String[] args) {
		//convert instant date to LocalDate
		Instant ins=Instant.now();
//		ZonedDateTime zt=ins.atZone(ZoneId.systemDefault());
		ZonedDateTime zt = ins.atZone(ZoneId.of("Asia/Tokyo"));

		LocalDate dt=zt.toLocalDate();
		
		//convert LocalDate into java.sql.date
		LocalDate ldt=LocalDate.now();
		java.sql.Date sqldt=Date.valueOf(ldt);
		System.out.println("SQL date: "+ sqldt);
		
		//convert   java.sql.dat into eLocalDate
		LocalDate ldt2=sqldt.toLocalDate();
		System.out.println("Local date: "+ ldt2);
		
	}

}
