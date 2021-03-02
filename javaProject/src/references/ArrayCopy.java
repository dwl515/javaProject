package references;

public class ArrayCopy {
	public static void main(String[]args) {
		int[] oldAry = {45,55,67};
		int[] newAry = new int[3];
		for(int i= 0; i< oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}
		String[] names = {"임성원", "정준영", "도왕락"};
		int[] scores = {88,89,90};
		//향상된 for문.
	    for (String name : names) {
	    	System.out.println(name);
	    }
		int sum = 0;
		for(int score: scores) {
			sum = sum+score;
		}
		System.out.println("합계점수 : " + sum);
		
		
		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 0 , newAry2, 0, 2);
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
	}
	public static void arryCopy() {
		int[] oldAry = {45,55,67};
		int[] newAry = new int[3];
		for(int i= 0; i< oldAry.length; i++) {
			newAry[i] = oldAry[i];
	}
	}
}
