package objects;

public class PersonExample {

	public static void main(String[] args) {
//		Person person = new Person();
//		person.name = "홍길동";
//		person.age = 35;
//		person.weight = 70;
//		person.height = 176;
//		person.eat();
//		person.sleep();
//		person.walk();
//		person.introduce();
//
//		Person person1 = new Person();
//		person1.name = "김길동";
//		person1.age = 27;
//		person1.weight = 65;
//		person1.height = 173;
//		person1.eat();
//		person1.sleep();
//		person1.walk();
//		person1.introduce();
        
		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 195.7, 75.5);
		persons[1] = new Person("김길동", 17, 181.3, 80.5);
		persons[2] = new Person("이길동", 21, 176.8, 83.5);
		persons[3] = new Person("박길동", 16, 177.0, 76.5);
		persons[4] = new Person("최길동", 30, 185.1, 82.5);

		for (Person person : persons) {
			if (person.age > 20 && person.height > 170.0) {
				person.introduce();
			}
		}
	}

}
