package objects;

public class StudentScore {
	private String name;
	private int eng;
	private int math;
	public char[] getEng;

	StudentScore() {

	}

	StudentScore(String name, int engScore, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	void showinfo() {
		System.out.println("이름: " + name + " 영어 :" + eng + " 수학 " + math + " 합계: " + (math + eng));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
	return this.eng;
	}
}
