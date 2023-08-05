package bts;

public class DripEdge extends Material {
	
	String color;

	public DripEdge(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Drip Edge";
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public int getAmount() {
		int amount = edge / 10 + 1;
		super.amount = amount;
		return amount;
	}

}
