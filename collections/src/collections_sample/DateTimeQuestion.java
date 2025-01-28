package collections_sample;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import java.util.function.Predicate;

public class DateTimeQuestion {

	public static void main(String[] args) {

		LocalDate d = LocalDate.parse("2024-09-12");// by default will accept y-m-d

		String str = "24/12/2024";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dd = LocalDate.parse(str, dtf);
		System.out.println(d.getMonth());
		Employee e = new Employee("mm", dd);
		
	}

}
