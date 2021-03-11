package ro.ase.acs.classes;

import ro.ase.acs.interfaces.Taxable;

public final class Car extends Vehicle implements Taxable {
	private String carColor;
	private int carCapacity;
	
	public Car() {
		super();
		carColor = "white";
		carCapacity = AVERAGE_CAR_CAPACITY;
	}
	
	public Car(String name, int speed, String color, int capacity) {
		super(name, speed);
		this.carColor = color;
		this.carCapacity = capacity;
	}
	
	public String getColor() {
		return carColor;
	}

	public void setColor(String color) {
		this.carColor = color;
	}

	public int getCapacity() {
		return carCapacity;
	}

	public void setCapacity(int capacity) {
		this.carCapacity = capacity;
	}

	@Override
	public double computeTax() {
		float carTax = 0;
		if(carCapacity < AVERAGE_TAX) {
			carTax = (float)carCapacity / 1000 * MIN_TAX;
		}
		if(carCapacity>= AVERAGE_TAX) {
			carTax = (float)carCapacity / 1000 * MIN_TAX * 2;
		}
		return carTax < MIN_TAX ? MIN_TAX : carTax;
	}

	@Override
	public final void move() {
		System.out.println("The car is moving");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Car copy =  (Car)super.clone();
		copy.carColor = carColor;
		copy.carCapacity = carCapacity;
		return copy;
	}
}
