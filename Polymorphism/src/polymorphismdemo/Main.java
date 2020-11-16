package polymorphismdemo;

public class Main {
public static void main(String[] args) {
	
	
	Vehicle vehicle= new Vehicle();
	Vehicle motor = new Motorcycle();
	Vehicle car = new Car();
	
	vehicle.vehicleType();
	motor.vehicleType();
	car.vehicleType();
}
}
