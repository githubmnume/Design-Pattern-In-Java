package structural.adapter;

public class EnglandVoltage implements Voltage110V {

	@Override
	public void work110V() {
		System.out.println("EnglandVoltage supply");
	}


}
