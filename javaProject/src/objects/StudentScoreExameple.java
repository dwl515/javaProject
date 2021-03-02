package objects;

public class StudentScoreExameple {

	public static void main(String[] args) {
		StudentScore s1 = new StudentScore("홍길동", 88, 90);

		StudentScore s2 = new StudentScore("김길동", 77, 85);

		StudentScore s3 = new StudentScore("도길동", 89, 92);
		
		StudentScore s4 = new StudentScore();
//		s4.name = "최길동";
		s4.setName("최길동");
//		s4.eng = 70;
		s4.setEng(70);		
//		s4.math = 80;
		s4.setMath(80);
		System.out.println(s4.getEng);
		
		StudentScore[] studentscore = new StudentScore[4];
					   studentscore[0] = s1;
					   studentscore[1] = s2;
					   studentscore[2] = s3;
					   studentscore[2] = s4;


		for (StudentScore student : studentscore) {
			student.showinfo();
		}
	}

}
