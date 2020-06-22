package L9_June28.OOPS_Story1;



public class Person {

	String name = "Ankit";
	int age = 100;

	public Person() {

	}

	public Person(String name, int age) throws ArrayIndexOutOfBoundsException {

		if (age < 0) {
			 throw new ArrayIndexOutOfBoundsException("Invalid Age.") ;
			// System.out.println("invalid age");
			// return ;
		}
		this.name = name;
		this.age = age;
	}

	public void introduceYourself() {
		System.out.println(name + " is " + age + " years old.");
	}

	public void sayHi(String name) {
		System.out.println(this.name + " says hi to  " + name);
	}

}
