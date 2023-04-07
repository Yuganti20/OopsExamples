package Oops;

public class Learner {
	int cityNo;
	String cityName;
	void displayCity() 
	{
		System.out.println("city no:"   +cityNo);
		System.out.println("CityName:"  +cityName);
	}
	public static void main(String[] args) {
		Learner c1= new Learner();
		c1.cityNo=100;
		String pune = null;
		c1.cityName=pune;
		
	}
	

}
