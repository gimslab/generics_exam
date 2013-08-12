package generic_exam1;

public class SumResult implements Result {

	private int result;

	public SumResult(int i) {
		this.result = i;
	}

	@Override
	public String toString() {
		return "sum result = " + result;
	}
}