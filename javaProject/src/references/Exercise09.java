package references;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택>");

			int selectNO = scanner.nextInt();
			if (selectNO != 5 && scores == null) {
				System.out.println("학생수를 입력하세요.. ");
				System.out.println();
				continue;
			}
			if (selectNO == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];
			} else if (selectNO == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNO == 3) {
				int sum = 0;
				double avg = 0.0;
				int maxValue = 0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (scores[i] > maxValue) {
						maxValue = scores[i];
					}
				}

			} else if (selectNO == 4) {
			} else if (selectNO == 5) {
			}
			run = false;

		}
	}
}