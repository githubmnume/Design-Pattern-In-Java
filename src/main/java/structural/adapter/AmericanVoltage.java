package structural.adapter;

public class AmericanVoltage implements Voltage110V {

	@Override
	public void work110V() {
		System.out.println("AmericanVoltage supply");
	}


}
