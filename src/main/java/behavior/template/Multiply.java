package behavior.template;

import java.io.IOException;

public class Multiply extends AbstractOperation{

	@Override
	public Number operate(Number number1, Number number2) {
		return number1.doubleValue() * number2.doubleValue();
	}

	@Override
	public Number getNum1() throws IOException {
		return Double.valueOf(20);
	}

	@Override
	public Number getNum2() throws IOException {
		return Double.valueOf(10);
	}
	

}
