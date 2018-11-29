package structural.adapter;

public class ChinesEelectricity {
	
	private Voltage220V voltage220v;

	public void work() {
		voltage220v.work220V();
		System.out.println("ChinesEelectricity works");
	}

	public Voltage220V getVoltage220v() {
		return voltage220v;
	}

	public void setVoltage220v(Voltage220V voltage220v) {
		this.voltage220v = voltage220v;
	}

}
