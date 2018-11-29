package structural.adapter.instanceAdapter;

import structural.adapter.Voltage110V;
import structural.adapter.Voltage220V;

public class VoltageAdapterImplements implements Voltage220V {

	private Voltage110V voltage110V;

	@Override
	public void work220V() {
		voltage110V.work110V();
	}

	public Voltage110V getVoltage110V() {
		return voltage110V;
	}

	public void setVoltage110V(Voltage110V voltage110v) {
		voltage110V = voltage110v;
	}
}
