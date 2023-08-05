package bts;

public class IceAndWater extends Material {

	public IceAndWater(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Ice & Water Shield";
	}
	
	@Override
	public int getAmount() {
		int amount = super.valley / 60 + 1;
		return amount;
	}

}
