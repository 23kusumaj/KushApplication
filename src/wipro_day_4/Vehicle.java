package wipro_day_4;

 abstract class Vehicle {
	 abstract void speed();
	 abstract void brand();
 }
	 class Car extends Vehicle{
		 void speed() {
			 System.out.println("speed of the car: 5km/hr");
			 
		 }
		 void brand() {
			 System.out.println("brand is :audi");
		 }
		 
	 }
	 class Bike extends Vehicle{
		 void speed() {
			 System.out.println("speed of the bike: 4km/hr");
		 }
		 void brand() {
			 System.out.println("brand is: yamaha");
		 }
	 }

