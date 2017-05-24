package capitulo6;

import java.util.Calendar;

public class RelogioCalendar implements Relogio{

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
