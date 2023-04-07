package Oops;

import java.util.Scanner;

class Student{
	int id;
	String name;
	Student(int i,String n){
		id=i;
		name=n;
	
	}
	void display() {
		System.out.println("Id: " +id);
		System.out.println("Name: "+name);
		
	}
}
public class ConstructorDemoTwo {

	public static void main(String[] args) {
		String name1 = null;
		int id1 = 0;
		Student s1=new Student(id1,name1);
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name = sc.next();
		Student s=new Student(id,name);
		s.display();
		System.out.println("-------------");
		
		
		Student s21=new Student(id1,name1);
		s1.display();
		  s21.display();

	}

}
