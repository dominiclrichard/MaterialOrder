package bts;

public class Starter extends Material {

	public Starter(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Starter";
	}
	
	@Override
	public int getAmount() {
		amount = super.edge / 100 + 1;
		return amount;
	}

}
