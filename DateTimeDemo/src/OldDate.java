import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class OldDate {

	public static void main(String[] args) {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.GERMANY);
		Date dt = new Date();
		System.out.println(df.format(dt));
		
		DateFormat df2 = DateFormat.getDateInstance(DateFormat.LONG, Locale.ITALY);
		Calendar c = Calendar.getInstance();
		System.out.println(df2.format(c.getTime()));
		
//		try
//		{
//			DriverManager.getConnection(""," ", "");
//
//		}catch(SQLException e)
//		{
//			System.out.println("Sql Excpetion");
//		}
	}

}
