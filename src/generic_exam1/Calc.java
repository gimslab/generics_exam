package generic_exam1;

public interface Calc<P extends Param, R extends Result> {
	public R execute(P p);
}
