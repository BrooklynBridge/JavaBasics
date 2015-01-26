import java.time.LocalDate;
import java.util.Locale;


public class JavaClasses {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.ROOT);
		
		LocalDate today = LocalDate.now();
		double cosine = Math.cos(Math.PI);
		
		System.out.println(today);
		System.out.println(cosine);

	}

}
