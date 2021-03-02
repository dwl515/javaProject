package objects;

public class Person {
	String name;
	int age;
	double weight;
	double height;
	Person(String name, int age, double weight, double height ) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	}
	
//	Person(String name){
//		this.name = name;
//	}
//	
//	Person(int age,int weight, int height){
//		this.age = age;
//		this.weight = weight;
//		this.height = height;
//	}

	void eat() {
		System.out.println("먹는다");
	}
	void sleep() {
		System.out.println("잔다");
	}
	void walk() {
		System.out.println("걷는다");
	}
	void introduce() {
		System.out.println("이름은? " + this.name + " 나이는? "+ this.age + " 입니다." );
	}
}
