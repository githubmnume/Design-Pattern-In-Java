package structural.adapter.instanceAdapter;

import structural.adapter.Voltage110V;
import structural.adapter.Voltage220V;

/**
 * 双向转换?
 * @author zhouufen
 *
 */
public class VoltageAdapter implements Voltage110V, Voltage220V {
	

	private Voltage110V voltage110V;
	private Voltage220V voltage220V;
	
	@Override
	public void work220V() {
		voltage110V.work110V();
	}

	@Override
	public void work110V() {
		voltage220V.work220V();
	}

	public Voltage110V getVoltage110V() {
		return voltage110V;
	}

	public void setVoltage110V(Voltage110V voltage110v) {
		voltage110V = voltage110v;
	}

	public Voltage220V getVoltage220V() {
		return voltage220V;
	}

	public void setVoltage220V(Voltage220V voltage220v) {
		voltage220V = voltage220v;
	}

}
