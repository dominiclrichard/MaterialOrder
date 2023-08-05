package bts;

public class PipeJackThreeToOne extends Material {

	public PipeJackThreeToOne(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Pipe Jacks - 3\" - 1\" ";
	}
	
	public PipeJackThreeToOne(int pipes) {
		super(0, 0, 0, 0);
		super.type = "Pipe Jacks - 3\" - 1\" ";
		super.amount = pipes;
	}

}
