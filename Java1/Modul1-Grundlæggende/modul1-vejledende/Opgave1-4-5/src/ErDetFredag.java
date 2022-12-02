import java.util.Calendar;

public class ErDetFredag {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		if (day == Calendar.FRIDAY) {
			System.out.println("Det er fredag!");
		} else {
			System.out.println("Det er ikke fredag");
		}
	}
}
