package ro.ase.acs.classes;

public abstract class Vehicle implements Cloneable {
	private String vehicleName;
	private int vehicleSpeed;
	public static final int AVERAGE_VEHICLE_SPEED = 1;
	
	public Vehicle() {
		vehicleName = "";
		vehicleSpeed = AVERAGE_VEHICLE_SPEED;
	}
	
	public Vehicle(String vehicleName, int vehicleSpeed) {
		this.vehicleName = vehicleName;
		this.vehicleSpeed = vehicleSpeed;
	}

	public String getName() {
		return vehicleName;
	}

	public int getSpeed() {
		return vehicleSpeed;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Vehicle copy = (Vehicle)super.clone();
		copy.vehicleName = vehicleName;
		copy.vehicleSpeed = vehicleSpeed;
		return copy;
	}

	public abstract void move();
}
