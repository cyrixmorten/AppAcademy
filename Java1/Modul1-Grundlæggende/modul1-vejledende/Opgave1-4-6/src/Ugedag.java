import java.util.Calendar;

public class Ugedag {
	public static void main(String[] args) {
		System.out.print("Det er ");
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		switch (day) {
		case Calendar.MONDAY:
			System.out.println("Mandag");
			break;
		case Calendar.TUESDAY:
			System.out.println("Tirsdag");
			break;
		case Calendar.WEDNESDAY:
			System.out.println("Onsdag");
			break;
		case Calendar.THURSDAY:
			System.out.println("Torsdag");
			break;
		case Calendar.FRIDAY:
			System.out.println("Fredag");
			break;
		case Calendar.SATURDAY:
			System.out.println("Lørdag");
			break;
		case Calendar.SUNDAY:
			System.out.println("Søndag");
			break;


		}
	}
}
