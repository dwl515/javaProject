//package references;
//
//import java.util.Scanner;
//
//public class ArrayExample2 {
//
//	public static void main(String[] args) {
//		// 10
//		// math.random()*100 + 1 1~100
//		Scanner scn = new Scanner(System.in);
//		int[] intary = new int[10];
//		for (int i = 0; i <= intary.length; i++) {
//			intary[i] = (int) (Math.random() * 100 + 1);
//			System.out.print("배열의 위치 입력>> ");
//			int loc = scn.nexInt();
//			if (loc <0) {
//				break;
//			}
//				System.out.println(loc + "위치의 배열값은: " + intary[loc]);
//			}
//		scn.close();
//		System.out.println("end of prog");
//	}
//}
