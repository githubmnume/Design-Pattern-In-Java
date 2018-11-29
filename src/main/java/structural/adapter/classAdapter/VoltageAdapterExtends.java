package structural.adapter.classAdapter;

import structural.adapter.AmericanVoltage;
import structural.adapter.Voltage220V;

public class VoltageAdapterExtends extends AmericanVoltage implements Voltage220V {
//is-a
	@Override
	public void work220V() {
		super.work110V();
	}

}
