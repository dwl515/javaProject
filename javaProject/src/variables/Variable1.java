package variables;

public class Variable1 {
	public static void main(String[] args) {
	byte b1 = 100;
	short s1 = 10000;
	int i1 = 25600;
	long l1 = 3456700;
	
	byte result1 = (byte) (b1 + 10); //casting
	short result2 = (short) (s1 + 100);
	
	int result3 = i1 + 10000;
	long result4 = l1 + 25000; // 자동으로 큰 데이터 값으로 바꿔서 연산함
	
	System.out.println("결과값은 : " + result4);
	}
	int result4 = 5;
	
}
