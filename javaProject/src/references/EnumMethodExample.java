package references;

public class EnumMethodExample {

	public static void main(String[] args) {
		week today = week.SUNDAY;
		String name = today.name();
		System.out.println(name);

		int ordianl = today.ordinal();
		System.out.println(ordianl);

		week day1 = week.MONDAY;
		week day2 = week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		if(args.length ==1) {
			String strDay = args[0];
			week weekDay = week.valueOf(strDay);
			if(weekDay == week.SATURDAY || weekDay == week.SUNDAY) {
				System.out.println("주말 이군요");
			}else {
				System.out.println("평일 이군요");
			}
		}
		week [] days = week.values();
		for(week day : days) {
			System.out.println(day);
		}

	}

}
