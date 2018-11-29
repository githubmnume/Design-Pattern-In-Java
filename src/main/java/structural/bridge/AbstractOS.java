package structural.bridge;

public abstract class AbstractOS implements OS{

	protected Standard standard;
	
	public Standard getStandard() {
		return standard;
	}
	public void setStandard(Standard standard) {
		this.standard = standard;
	}
	public AbstractOS(Standard standard) {
		super();
		this.standard = standard;
	}
}
