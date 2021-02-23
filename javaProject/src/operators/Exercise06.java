package operators;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lenghBottom = 10;
		int height = 7;
		double area = (lengthTop + lenghBottom)/ 2.0 * height;
		System.out.println("area1 :" + area);
		
		area = getrectArea(lengthTop, lenghBottom, height);
		System.out.println("area2 :" + area);

	}

	public static double getrectArea(int top, int bottom, int height) {
		double area = (double) (top + bottom) / 2 * height;
		return area;

	}
}
