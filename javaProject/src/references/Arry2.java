package references;

public class Arry2 {

	public static void main(String[] args) {
		int[] engScores = new int[3];
		engScores = new int[] { 88, 99, 52 };
		int[] mathScores = new int[3];
		mathScores = new int[] { 68, 95, 54 };

//		int[][] Scores = new int[2][3];
//		Scores[0] = new int[] { 88, 99 ,52};
//		Scores[1] = new int[] { 75, 35};

		int[][] Scores = { { 88, 99, 52 }, { 66, 75, 35 } };
		double avg = 0.0;
		for (int i = 0; i < Scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < Scores[i].length; j++) {
				sum += Scores[i][j];
			}
			if (i == 0) {
				avg = (double) sum / Scores[i].length;
				System.out.println("영어의 평균: " + avg);
			} else if (i == 1) {
				avg = (double) sum / Scores[i].length;
				System.out.println("수학의 평균: " + avg);
			}

			System.out.println(Scores.length);
			System.out.println(Scores[0].length);
			System.out.println(Scores[1].length);
		}

	}
}
