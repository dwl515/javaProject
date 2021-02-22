package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] agrs ) {
		int x = 10;
		int y = 10;
		int z;
		
	
		System.out.println(x++); //10 
		System.out.println(++x); //12
		System.out.println(x);   //12
		System.out.println("------------------");
		z= ++x + y++;
		System.out.println("z: "+ z + ", x: " + x + ", y:" +y);
		
		
	}

}
