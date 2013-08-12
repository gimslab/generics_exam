package generic_exam1;

public class Main {
	public static void main(String[] args) {
		Calc<SumParam, SumResult> calc = CalcFactory
				.getInstance(SumParam.class);
		SumResult sumResult = calc.execute(new SumParam(1, 2, 3));
		System.out.println(sumResult);
	}
}
