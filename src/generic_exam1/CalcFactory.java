package generic_exam1;

public class CalcFactory {

	public static <P extends Param, R extends Result> Calc<P, R> getInstance(
			Class<? extends Param> clazz) {
		return (Calc<P, R>) new SumCalc();
		// return new SumCalc();
	}

}
