package Oops;

class Vehical {
	int price = 20000;

	void showPrice() {
		System.out.println("vehical" + price);
	}
}

class Car extends Vehical {
	int cprice = 1000;

	void finalPrice() {
		price = price * cprice;
		System.out.println("car price:" + price);
	}

	class Bike extends Vehical {
		int bprice = 10;

		void finalPrice() {
			price = price * bprice;
			System.out.println("Bike price:" + price);
		}
	}

	public class HirachicalInheritance {

		public void main(String[] args) {
			// TODO Auto-generated method stub
			Car c = new Car();
			c.finalPrice();
			Bike b = new Bike();
			b.finalPrice();

		}

	}
}


