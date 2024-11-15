package luento7;

public class Vehicle {
	public void move() {
		System.out.println("Vehicle::move()");
	}

}

class Car extends Vehicle {
	@Override
	public void move() {
		System.out.println("Car::move()");
	}
	public void wheel() {
		System.out.println("Car::wheel()");
	}
}

class Boat extends Vehicle {
	@Override
	public void move() {
		System.out.println("Boat::move()");
	}
	public void floats() {
		System.out.println("Boat::floats()");
	}
}

class Saloon extends Car {
	@Override
	public void move() {
		System.out.println("Saloon::move()");
	}
}

class Convertible extends Car {};

class NewTestVehicle {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.move();
	}
}
