import java.util.Date;
import java.util.Locale;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//instanciando data atual
		Date d = new Date();
		System.out.println(d);
		
		
		//instânciando data passando por parametro
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy E");
		try {
			d = sdf.parse("20/06/2017 Ter");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//comando pra formatar a data pra aparecer apenas a data
		System.out.println(sdf.format(d));
	}
	
	/*Guia de formato
	 * 
	 * y = Year
	 * M = month in year
	 * D = Day in year
	 * d = Day in month
	 * H = hour in day
	 * h = hour in am/pm
	 * m = Minute in hour
	 * s = Second in minute
	 * S = Millisecond in number
	 */

}
