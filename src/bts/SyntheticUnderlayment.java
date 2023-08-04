package bts;

public class SyntheticUnderlayment extends Material {

	public SyntheticUnderlayment(int squares, int ridge, int edge) {
		super(squares, ridge, edge);
		super.type = "Synthetic Underlayment";
	}
	
	public int getAmount() {
		int amount = squares / 10 + 1;
		return amount;
	}

}
