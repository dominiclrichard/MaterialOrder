package bts;

public class RidgeShingles extends Material {

	public RidgeShingles(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Ridge Shingles";
	}

	@Override
	public int getAmount() {
		int amount = super.ridge / 33 + 1;
		super.amount = amount;
		return amount;
	}
}
