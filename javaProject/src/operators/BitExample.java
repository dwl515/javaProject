package operators;

public class BitExample {

	public static void main(String[] args) {
		int x = 45;
		int y = 25;
		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		// 101101           101101
		// 011001 &(논리곱)   011001 |(논리합)
		// 001001           111101
		x = 8;
		y = 3;
		System.out.println(Integer.toBinaryString(x));
		System.out.println(Integer.toBinaryString(y));
		System.out.println(x >> y);
		System.out.println(x << y);
		// 1000
	}

}
