package Oops;

public class Practice {
	
	void add (int a,int b) {
		System.out.println("addition " +(a+b));
	}
	void sub (int a,int b) {
		System.out.println("substraction " +(a-b));
	}
	
	void mul (int a,int b) {
		System.out.println("multiplication " +(a*b));
	}
	
	String msg(String name) {
		return "Hello " + name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice c=new Practice();
		c.add(15, 20);
		c.sub(30, 5);
		c.mul(20, 10);
		System.out.println(c.msg("yuganti"));

	}

}
