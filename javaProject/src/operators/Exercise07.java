package operators;

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean z = (x > 7) && (y <= 5);
		System.out.println(z);
		z = (x % 3 == 2) || (y % 2 != 1);
		System.out.println(z);
// || 참인 값이 나오면 뒤에 조건을 실행하지 않음  | 참인 값이 나오더라도 뒤에 조건 모두 실행
		z = (x++ % 2 == 0) || (y++ % 3 == 0);
		if (z) {
			System.out.println("true:" + x + ",y:" + y);
		} else {
			System.out.println("false:" + x + ",y:" + y);
		}
	}

}
