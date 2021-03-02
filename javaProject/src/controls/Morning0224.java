package controls;

public class Morning0224 {

	public static void main(String[] args) {
		// 영어, 수학점수 변수
		// 평균이 90이상이면 "수"
		// 80이상이면 "우"
		// 70이상이면 "미" 이하이면 "가"
		// 2. 임의의 값을 생성하는 Math.random()을 사용해서
		// 1 ~ 100까지 임의의 값을 생성해서
		// 3. 임의의 값을 생성하는 math.random()을 사용해서
		String grade;
		int en = (int) (Math.random() * 100)+1;
		int ma = (int) (Math.random() * 100)+1;
		int av = (en + ma)/2;
//		int en = 80;
//		int ma = 90;
//	    getAverage(en, ma);
		
		if (av >= 90) {
			grade = "수";
		} else if (av >= 80) {
			grade = "우";
		} else if (av >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		System.out.println("평균 " + av + "는 " + grade + "입니다");
	}

	public static String getAverage(int n1, int n2) {
		String grade;
		int av = (n1 + n2) / 2;
		if (av >= 90) {
			grade = "수";
		} else if (av >= 80) {
			grade = "우";
		} else if (av >= 70) {
			grade = "미";
		} else {
			grade = "가";
		}
		System.out.println("평균 " + av + "는 " + grade + "입니다");
		return "grade";
	}
}
