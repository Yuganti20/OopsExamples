package Oops;

class Employee{
	float salary;
	int getAge() {
		System.out.println("22");
		return 0;
	}
	
}
class Person extends Employee{
	String name;
	int getTotal() {
		System.out.println("23");
		return 0;
	}
}

class Hiring extends Employee{
	String name;
	int getData() {
		System.out.println("3");
		return 0;
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Hiring d=new Hiring();
       d.getAge();
       d.getData();
      
	}

}
