
public class GoodGuysDwarves implements GoodGuysInterface {

	private int number;

	public GoodGuysDwarves() {

	}

	@Override
	public int getNumber() {
		return number;
	}

	@Override
	public void setNumber(int number) {
		this.number = number;
	}
}
