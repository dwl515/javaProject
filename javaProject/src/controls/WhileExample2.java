package controls;

public class WhileExample2 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 9) {
			showResult(i);
			i++;
		}
	}

	public static void showResult(int num) {
		int a = 1;
		while (a <= 9) {
			System.out.println(num + " * " + a + " = " + num * a);
			a++;
		}
	}
}
