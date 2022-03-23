
public class Odometer {
	
	//private double variable
	//can only be accessed by the class methods/fields
	private double milesCovered;
	
	//Constructor
	public Odometer(){
		//initializing private variable 
		milesCovered = 0;
	}
	
	//setter method with one parameter
	public void setMiles(double miles) {
		milesCovered = miles;
	}
	
	//getter method
	public double getMiles() {
		return milesCovered;
	}
	
	//mutator method
	public void addMiles(double miles) {
		//adding new value
		milesCovered += miles;
	}
}
