package bts;

public class Material {
	
	public String type;
	public int amount;
	public int squares;
	public int ridge;
	public int edge;
	public int valley;
	
	public Material(int squares, int ridge, int edge, int valley) {
		this.squares = squares;
		this.ridge = ridge;
		this.edge = edge;
		this.valley = valley;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
