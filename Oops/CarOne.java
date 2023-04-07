package Oops;

public class CarOne {

	    String make;
	    String model;
	    int year;

	    void start() {
	        System.out.println("Car started!");
	    }
	}

	class Main {
	    public static void main(String[] args) {
	        CarOne myCar = new CarOne();
	        myCar.make = "Toyota";
	        myCar.model = "Camry";
	        myCar.year = 2022;

	        System.out.println("My car is a " + myCar.make + " " + myCar.model + " from " + myCar.year);
	        myCar.start();
	    }
	
	}


