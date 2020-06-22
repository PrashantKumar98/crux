package L10_June29.OOPS_Story2;

public class Client {

	public static void main(String[] args) {

		// case 1
		P obj1 = new P();
		System.out.println(obj1.d);
		System.out.println(obj1.d1);
		obj1.fun();
		obj1.fun1();

		// case 2
		P obj2 = new C();
		System.out.println(obj2.d); // 10
		System.out.println(((C) obj2).d); // 20
		System.out.println(obj2.d1); // 100
		System.out.println(((C) obj2).d2); // 200
		obj2.fun(); // C fun
		((P) obj2).fun(); // C fun
		obj2.fun1(); // P fun 1
		((C) obj2).fun2(); // C fun 2

		// case 3
		// C obj3 = new P();

		// case 4
		C obj4 = new C();
		System.out.println(obj4.d); // 20
		System.out.println(((P) obj4).d); // 10
		System.out.println(obj4.d1); // 100
		System.out.println(obj4.d2); // 200
		obj4.fun(); // C fun
		((P) obj4).fun(); // C fun
		obj4.fun1(); // P fun 1
		obj4.fun2(); // C fun 2

	}
}
