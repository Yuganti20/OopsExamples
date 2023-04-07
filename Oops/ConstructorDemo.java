package Oops;

public class ConstructorDemo {
	int id;
	String name;

	ConstructorDemo(int i, String n) {
		id = i;
		name = n;
	}

	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		ConstructorDemo s1 = new ConstructorDemo(111, "yuga");
		ConstructorDemo s2 = new ConstructorDemo(222, "vedu");
		s1.display();
		s2.display();

	}

}
