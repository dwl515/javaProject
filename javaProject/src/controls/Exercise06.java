package controls;

public class Exercise06 {

	public static void main(String[] args) {
		// 임의의 값 두수를 35,60
		// 35~60까지의 합을 구하는 프로그램 생성.
		// 44, 67
		int sNum = 44;
		int eNum = 67;
		int sum = getSumValue(sNum, eNum);
		// "두 수사이의 합계 :???"
		System.out.println(sNum + "과" + eNum + "의 합 :" + sum);
	}

	public static int getSumValue(int n1, int n2) {
		int sum = 0;
		if (n1>n2) {
			for(int i =n1; i >=n2; i--) {
				sum = sum +i;
			} eles {
				for (int i = n1; i <= n2; i++) {
			}
			sum = sum + i;
			// 정수1, 정수2 사이의 합을 구하는 메소드
		}
		return sum;
	}
	}

	public static int getSumValue(int n1, int n2) {
		int startno = (n1 > n2) ? n2 : n1;
		int endno = (n1 > n2) ? n1 : n2;
		int sum = 0;
		for (int i = startno; i <= endno; i++) {
			sum = sum + i;
			// 정수1, 정수2 사이의 합을 구하는 메소드
		}
		return sum;
	}

//	public static void Exercise06() {
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.println("*");
//			}
//			System.out.println();

}