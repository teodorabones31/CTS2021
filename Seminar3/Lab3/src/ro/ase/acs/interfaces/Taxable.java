package ro.ase.acs.interfaces;

public interface Taxable {
	public static final int MIN_TAX = 50;
	public static final int AVERAGE_TAX = 2000;
	public static final int AVERAGE_CAR_CAPACITY = 49;
	
	public double computeTax();
}
