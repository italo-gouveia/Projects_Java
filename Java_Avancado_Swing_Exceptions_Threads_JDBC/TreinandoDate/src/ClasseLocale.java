import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ClasseLocale {

	public static void main(String[] args) {
		Date d = new Date();
		
		Locale local = new Locale("ja");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy E", local);
		
		System.out.println(sdf.format(d));
	}
}
