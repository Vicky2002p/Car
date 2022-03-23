import java.util.Scanner;  //importing util package

//Driver class
public class RunCar {
	
	//main method
	public void main() {
		
		//scanner object
		Scanner scnr = new Scanner(System.in);
		
		//odometer object
		Odometer carMiles = new Odometer();
		
		//input variable
		double input;
		System.out.println("Enter the number of miles");
		
		//taking input
		input = scnr.nextDouble();
		
		//setting the input with setter method
		carMiles.setMiles(input);
		
		//printing the set miles
		System.out.println(carMiles.getMiles());
		System.out.println("Enter the additional miles travelled");
		
		//taking input of the additional miles travelled
		input = scnr.nextDouble();
		
		//adding the new miles travelled
		carMiles.addMiles(input);
		
		//printing the miles
		System.out.println(carMiles.getMiles());
		
		//closing the object
		scnr.close();
	}
}
