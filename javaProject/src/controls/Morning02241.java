package controls;

public class Morning02241 {

	public static void main(String[] args) {
//		int sum = 0;
//		for (int i = 11; i <= 30; i++) {
//			sum = sum + i;
//			System.out.println("i = " + i + " sum= " + sum);
		int sum = 0;
		int v1 = 11;
		int v2 = 30;
		for (int i = v1; i <= v2; i++) {
			sum += i;
			System.out.println("i = " + i + " sum= " + sum);
		}
	}

	public static int getsum(int fromvalue, int tovalue) {
		int sum = 0;
		for (int i = fromvalue; i <= tovalue; i++) {
			sum += 0;
			System.out.println("i = " + i + " sum= " + sum);
			return sum;
		}
	}

}
