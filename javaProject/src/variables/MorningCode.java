//변수 int값을 2개 선언.
//하나의 숫자 : 25대입
//하나의 숫자 : 본인 나이
//30보다 크면 나이가 좀 들었습니다.
//30보다 작으면 : 한창이네요.
//같으면 : 적정한 나이입니다.
package variables;

public class MorningCode {
	public static void main(String [] args) {
		int a1 = 30;
		int a2 = 32;
		
		if(a1<a2) {
			System.out.println("나이가 좀 들었습니다.");
		} 
		else if(a1==a2) {
			System.out.println("적정한 나이입니다.");
			} 
		else {
			System.out.println("적정한 나이입니다");
			}
	}
	
}
