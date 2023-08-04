package bts;

public class Material {
	
	public String type;
	public int amount;
	public int squares;
	public int ridge;
	public int edge;
	
	public Material(int squares, int ridge, int edge) {
		this.squares = squares;
		this.ridge = ridge;
		this.edge = edge;
	}
	
	public int getAmount() {
		return amount;
	}
	
}
