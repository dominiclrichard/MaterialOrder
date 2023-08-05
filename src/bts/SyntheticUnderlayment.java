package bts;

public class SyntheticUnderlayment extends Material {

	public SyntheticUnderlayment(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Synthetic Underlayment";
	}
	
	@Override
	public int getAmount() {
		int amount = squares / 10 + 1;
		return amount;
	}

}
