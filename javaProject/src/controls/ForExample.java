package controls;

public class ForExample {

	public static void main(String[] args) {
		// 1~10까지 합계
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
//			System.out.print("i : " + i + "\t");
//			System.out.println("sum : " + sum);
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("1~10 짝수의 합:" + sum);
	}
}