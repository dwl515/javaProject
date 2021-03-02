package references;

import java.util.Calendar;

enum kind {
	MALE, FEMALE;
}

enum Choice {
	YES, NO
}

public class EnumExample {

	public static void main(String[] args) {
		week today = null;
		today = week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 " + cal.get(Calendar.YEAR));
		System.out.println("월 " + cal.get(Calendar.MONTH));
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK));
		int maleORfemale = 1; // 1 남자, 2 여자
		int yesORno = 1; // 1 yes, 2 no
		int Week = cal.get(Calendar.DAY_OF_WEEK);
		switch (Week) {
		case 1:
			today = week.SUNDAY;
			break;
		case 2:
			today = week.MONDAY;
			break;
		case 3:
			today = week.TUESDAY;
			break;
		case 4:
			today = week.WEDNESDAY;
			break;
		case 5:
			today = week.THURSDAY;
			break;
		case 6:
			today = week.FRIDAY;
			break;
		case 7:
			today = week.SATURDAY;
			break;
		}
		if (today == week.SUNDAY || today == week.SATURDAY) {
			System.out.println("주말에는 여행을 갑니다.");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}

	}
}
