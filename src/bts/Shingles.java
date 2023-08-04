package bts;

public class Shingles extends Material {

	String color;
	String make;
	String brand;
	
	public Shingles(int squares, int ridge, int edge) {
		super(squares, ridge, edge);
		super.type = "Shingles";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	@Override
	public int getAmount() {
		super.amount = squares;
		return squares;
	}
}
