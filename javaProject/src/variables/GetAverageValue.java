//2개의 정수를 입력받을 수 있도록 변수
// 하나의 값은:17, 하나의 값은 18 저장.
// 결과를 실수: 이 두수의 평균을 구하는 프로그램을 작성
// 두수의 평균은 : 17.5 입니다.


package variables;

public class GetAverageValue {
	public static void main(String[] agrs) {
		int a1 = 17;
		int a2 = 18;
		float result =(float)(a1+a2)/2;
		
		System.out.println("두수의 평균은:" + result + "입니다");
	
	}

}
