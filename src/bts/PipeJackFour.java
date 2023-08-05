package bts;

public class PipeJackFour extends Material {

	public PipeJackFour(int squares, int ridge, int edge, int valley) {
		super(squares, ridge, edge, valley);
		super.type = "Pipe Jacks - 4\"";
	}
	
	public PipeJackFour(int pipes) {
		super(0, 0, 0, 0);
		super.type = "Pipe Jacks - 4\"";
		super.amount = pipes;
	}

}
