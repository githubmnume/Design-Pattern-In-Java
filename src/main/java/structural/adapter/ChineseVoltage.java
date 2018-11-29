package structural.adapter;

public class ChineseVoltage implements Voltage220V {

	@Override
	public void work220V() {
		System.out.println("ChineseVoltage supply");
	}

}
