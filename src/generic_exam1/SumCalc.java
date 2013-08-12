package generic_exam1;

public class SumCalc implements Calc<SumParam, SumResult> {

	@Override
	public SumResult execute(SumParam p) {
		return new SumResult(p.i + p.j + p.k);
	}

}
