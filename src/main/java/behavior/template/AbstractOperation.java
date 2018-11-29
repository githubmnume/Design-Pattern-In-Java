package behavior.template;

import java.io.IOException;

public abstract class AbstractOperation implements Operation {
	public Number getNum1() throws IOException {
		return Integer.valueOf(1);
	}
	public Number getNum2() throws IOException {
		return Integer.valueOf(1);
	}
	
	public final void name() {
		try {
			show(operate(getNum1(),getNum2()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void show(Number result) {
		System.out.println("result is: " + result);
	}
}
